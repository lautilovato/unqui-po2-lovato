package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimeraNecesidadTestCase {

	private PrimeraNecesidad producto;
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		producto = new PrimeraNecesidad("pan", 20, 10);
	
	}
	
	@Test
	void testPrecioCuidado() {
		double precio = producto.getPrecio();
		assertEquals(precio, 18);
	}

}
