package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.*;

class PersonaTestCase {

private Persona persona;
private Persona persona2;
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		persona = new Persona("Lautaro", LocalDate.of(2002, 10, 9));
		persona2 = new Persona("David", LocalDate.of(2000, 6, 5));
		
	}
	
	@Test
	public void testEdad() {
		int edad = persona.getEdad();
		assertEquals(edad, 22);
	}

	@Test
	public void testMenorQue() {
		boolean respuesta = persona.menorQue(persona2);
		assertEquals(respuesta, true);
	}

}
