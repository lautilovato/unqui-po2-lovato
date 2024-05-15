package ar.edu.unq.po2.tpComposite.ej3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EngineerAndKnightTestCase {
	
	private Engineer engineer;
	private Knight knight;
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		engineer = new Engineer(1, 3);
		knight = new Knight(3,4);
		
		engineer.walkTo(0, 0);
		knight.walkTo(10, 11);
	}
	
	@Test
	void testEngineerWalk() {
		assertEquals(engineer.getUbicationX() , 0);
		assertEquals(engineer.getUbicationY() ,0 );
	}
	
	@Test
	void testKnightWalk() {
		assertEquals(knight.getUbicationX() ,10 );
		assertEquals(knight.getUbicationY() ,11 );
	}
	
	
}
