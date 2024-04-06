package ar.edu.unq.po2.tp3;
import java.time.*;



public class Persona {

	private String name;
	private LocalDate birthdate;
	
	public Persona(String name, LocalDate birthdate) {
		this.name = name;
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}
	
	public LocalDate getBirthdate() {
		return birthdate;
	}

	public int getEdad(){
		
		int edad = 2024 - this.getBirthdate().getYear();
		
		return edad;
	}
	
	public boolean menorQue(Persona persona) {
		
		return this.getEdad() < persona.getEdad();
	}
}
