package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SupermercadoTestCase {
	
	private Supermercado supermercado;
	private PrimeraNecesidad producto;
	private Producto producto2;
	
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		supermercado = new Supermercado("eleven", "quilmes 200");
		producto = new PrimeraNecesidad("pan", 20, 10);
		producto2 = new Producto("agua", 30);
	
		supermercado.agregarProducto(producto);
		supermercado.agregarProducto(producto2);

	}
	
	@Test
	void testCantidadDeProductos() {
		int amount = supermercado.cantidadDeProductosComersializados();
		assertEquals(amount, 2); 
	}
	
	@Test
	void testPreciosTotales() {
		double precios = supermercado.sumaDePreciosDeProductos();
		assertEquals(precios, 48); 
	}

}
