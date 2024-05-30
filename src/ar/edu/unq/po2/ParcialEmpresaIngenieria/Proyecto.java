package ar.edu.unq.po2.ParcialEmpresaIngenieria;

import java.util.ArrayList;
import java.util.List;

public class Proyecto implements Actividad{


	private List<Actividad> actividades = new ArrayList<Actividad>();
	
	public Proyecto(List<Actividad> actividades) {
		this.actividades = actividades;
	}
	
	public List<Actividad> getActividades() {
		return actividades;
	}

	public double costoConMetodoDePago(MetodoDePago metodoDePago) {
		
		return this.getActividades().stream().mapToDouble(a -> a.costoConMetodoDePago(metodoDePago)).sum() * 1.2;
	}
}
