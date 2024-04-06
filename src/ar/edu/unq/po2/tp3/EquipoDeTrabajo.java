package ar.edu.unq.po2.tp3;
import java.util.List;
import java.util.ArrayList;

public class EquipoDeTrabajo {
	
	private List<Persona> integrantes = new ArrayList<Persona>();
	private String nombre;
	
	public EquipoDeTrabajo(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public List<Persona> getIntegrantes() {
		return integrantes;
	}

	public int promedioDeEdad() {
		int cantidadIntegrantes = this.getIntegrantes().size();
		int edadesTotales = 0;
		for(Persona integrante:this.getIntegrantes()) {
			edadesTotales = edadesTotales + integrante.getEdad();		
		}
		return edadesTotales / cantidadIntegrantes;
	}

	public void agregarPersona(Persona persona) {
		integrantes.add(persona);
	}

	
	
}
