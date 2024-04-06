package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTestCase {

	private EquipoDeTrabajo equipo;
	private Persona persona;
	private Persona persona2;
	private Persona persona3;
	private Persona persona4;
	private Persona persona5;
		
		@BeforeEach
		public void setUp() throws Exception { 
			
			equipo = new EquipoDeTrabajo("Team11");
			persona = new Persona("Lautaro", LocalDate.of(2002, 10, 9));
			persona2 = new Persona("Lautaro", LocalDate.of(2000, 10, 9));
			persona3 = new Persona("Lautaro", LocalDate.of(2006, 10, 9));
			persona4 = new Persona("Lautaro", LocalDate.of(2004, 10, 9));
			persona5 = new Persona("Lautaro", LocalDate.of(2008, 10, 9));

			equipo.agregarPersona(persona);
			equipo.agregarPersona(persona2);
			equipo.agregarPersona(persona3);
			equipo.agregarPersona(persona4);
			equipo.agregarPersona(persona5);
			
		}
		
		@Test
		public void testPromedioDeEdad() {
			
			int promedio = equipo.promedioDeEdad(); 
			assertEquals(promedio, 20);
		}

		
}
