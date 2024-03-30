package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PuntoTestCase {
	
	private Punto puntoA;
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		puntoA = new Punto(1,1);
	}
	
	@Test
	void testPointWithOutParameter() {
		Punto punto = new Punto();
		assertEquals(punto.getX(), 0);
		assertEquals(punto.getY(), 0);
	}
	
	@Test
	void testPointsSum() {
		Punto puntoB =new  Punto(2,2);
		Punto newPoint = puntoA.sumWithOtherPoint(puntoB);
		assertEquals(newPoint.getX(), 3);
		assertEquals(newPoint.getY(), 3);
	}


}
