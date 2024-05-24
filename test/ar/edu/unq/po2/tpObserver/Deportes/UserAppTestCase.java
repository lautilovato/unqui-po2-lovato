package ar.edu.unq.po2.tpObserver.Deportes;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class UserAppTestCase {

	private Server server;
	private UserApp userApp;
	private Match match;
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		server = new Server(Arrays.asList("Basket", "Futbol"));
		userApp = new UserApp(server, Arrays.asList("Futbol", "Golf"));
		
		match = mock(Match.class);
		
	}
	
	@Test
	void TestSportIsInterestForServer() {
		
		when(match.getSport()).thenReturn("Basket");
		
		server.registerMatch(match);
		
		assertEquals(server.getLastMatchRegister(), match);
		
	}
	
	@Test
	void TestSportIsNotInterestForServer() {
		
		when(match.getSport()).thenReturn("Golf");
		
		server.registerMatch(match);
		
		assertEquals(server.getLastMatchRegister(), null);
		
	}
	
	@Test
	void TestSportIsNotInterestForUserApp() {
		
		when(match.getSport()).thenReturn("Futbol");
		
		server.registerMatch(match);
		
		assertTrue(userApp.getMatchesOfInterest().contains(match));
		
	}
	
}
