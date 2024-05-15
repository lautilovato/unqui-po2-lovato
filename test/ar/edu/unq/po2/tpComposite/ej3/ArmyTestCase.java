package ar.edu.unq.po2.tpComposite.ej3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

class ArmyTestCase {

	private Engineer engineer1;
	private Engineer engineer2;
	private Knight knight1;
	private Knight knight2;
	
	private Army armyMain;
	private Army armySec;
	
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		engineer1 = new Engineer(1, 3);
		engineer2 = new Engineer(3, 1);
		knight1 = new Knight(3, 4);
		knight2 = new Knight(4, 3);
		
		armySec = new Army(Arrays.asList(engineer1, knight1));
		armyMain = new Army(Arrays.asList(engineer2, knight2, armySec));
		
		armyMain.walkTo(23, 11);
		
	}
	
	@Test
	void testArmyWalk() {
		assertEquals(engineer1.getUbicationX() , 23);
		assertEquals(engineer1.getUbicationY() , 11);

		assertEquals(engineer2.getUbicationX() , 23);
		assertEquals(engineer2.getUbicationY() , 11);
		
		assertEquals(knight1.getUbicationX() , 23);
		assertEquals(knight1.getUbicationY() , 11);
		
		assertEquals(knight2.getUbicationX() , 23);
		assertEquals(knight2.getUbicationY() , 11);
	}

}
