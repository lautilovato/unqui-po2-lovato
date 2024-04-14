package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class TrabajadorTestCase {

	private Trabajador trabajador;
	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private Ingreso ingreso3;
	private HorasExtra horasExtra;	
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		ingreso1 = new Ingreso("Enero","comprobante", 176);
		ingreso2 = new Ingreso("Febrero","comprobante", 178);
		ingreso3 = new Ingreso("Marzo","comprobante", 190);
		horasExtra = new HorasExtra(5, 35.20);
		
		List<Ingreso> ingresos = Arrays.asList(ingreso1, ingreso2, ingreso3);
		
		trabajador = new Trabajador(ingresos);
		trabajador.agregarHorasExtra(horasExtra);

	}
	
	@Test
	void testTotalPercibido() {
		double total = trabajador.getTotalPercibido();
		assertEquals(total, 720); 
	}
	
	@Test
	void testMontoIMpoible() {
		double total = trabajador.getMontoImponible();
		assertEquals(total, 544); 
	}
	
	@Test
	void testImpuestoAPagar() {
		double total = trabajador.getImpuestoAPagar();
		assertEquals(total, 10.88); 
	}

}
