package ar.edu.unq.po2.ParcialEmpresaIngenieria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

public class EmpresaTest {
	
	private Empresa empresa;
	private Proyecto proyectoPrincipal;
	
	private Obra obra1;
	private Operario albañil;
	private Material ladrillos;
	
	private Proyecto proyecto2;
	private Transporte transporte;
	private Obra obra2;
	private Operario albañil2;
	private Material cemento;
	
	private MetodoDePago metodoDePago;
	
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		metodoDePago = new MetodoDePagoEfectivo();
		
		albañil  = new Operario(10, 5, 5); // sueldo = 55
		ladrillos = new Material(20, 30); // efectivo = 600 mp= 582 tC 3 cuotas =672 
		obra1 = new Obra(Arrays.asList(albañil), Arrays.asList(ladrillos));
		
		
		transporte = new Transporte(50, 150, 10); // costo = 75000
		
		albañil2 = new Operario(5, 4, 3); // sueldo = 20
		cemento = new Material(10, 15); // efectivo = 150 mp = 145,5 tC 3 cuotas =168
		obra2 = new Obra(Arrays.asList(albañil2), Arrays.asList(cemento));
	
		proyecto2 = new Proyecto(Arrays.asList(transporte, obra2));
		
		proyectoPrincipal = new Proyecto(Arrays.asList(obra1, proyecto2));
		empresa = new Empresa("Apsis S.A", "30-123456-0", proyectoPrincipal, metodoDePago);
	
	}
	
	@Test
	void testCostoObra2() {
		double costo = obra2.costoConMetodoDePago(metodoDePago);
		assertEquals(costo, 170);
	}

	@Test
	void testCostoProyecto2() {
		double costo = proyecto2.costoConMetodoDePago(metodoDePago);
		assertEquals(costo, 90204);
	}
	

	@Test
	void testCostoEmpresaEfectivo() {
		
		double costo = empresa.costo();
		
		assertEquals(costo, 109030.8);
	}
	
	
	@Test
	void testobraConMP() {
		double costo1 = obra1.costoConMetodoDePago(new MetodoMercadoPago());
		
		double costo2 = obra2.costoConMetodoDePago(new MetodoMercadoPago());
		
		assertEquals(costo1, 637);
		assertEquals(costo2, 165.5);
		
	}
	
	
	
	
	
	
	
	
}
