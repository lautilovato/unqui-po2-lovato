package ar.edu.unq.po2.ParcialEmpresaIngenieria;

import java.util.ArrayList;
import java.util.List;


public class Obra implements Actividad{

	private List<Operario> operarios = new ArrayList<Operario>();
	private List<Material> materiales = new ArrayList<Material>();
	
	public Obra(List<Operario> operarios, List<Material> materiales) {
		
		this.operarios = operarios;
		this.materiales = materiales;
	}
	
	public List<Operario> getOperarios() {
		return operarios;
	}


	public List<Material> getMateriales() {
		return materiales;
	}
	
	private double costoMateriales() {
		return this.getMateriales().stream().mapToDouble(m -> m.getCosto()).sum();
	}
	
	private double costoSueldosOperarios() {
		return this.getOperarios().stream().mapToDouble(o -> o.getSueldo()).sum();
	}
	
	public double costoConMetodoDePago(MetodoDePago metodoDePago) {
		return metodoDePago.ajustarPrecio(this.costoMateriales()) + this.costoSueldosOperarios();
	}
	
	
}
