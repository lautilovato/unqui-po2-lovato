package ar.edu.unq.po2.ParcialEmpresaIngenieria;

public class Empresa {
	
	private String razonSocial;
	private String cuit;
	private Actividad actividadActual;
	private MetodoDePago metodoDePago;

	public Empresa(String razonSocial, String cuit, Actividad actividadActual, MetodoDePago metodoDePago) {
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.actividadActual = actividadActual;
		this.metodoDePago = metodoDePago;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public Actividad getActividadActual() {
		return actividadActual;
	}

	public void setActividadActual(Actividad actividadActual) {
		this.actividadActual = actividadActual;
	}

	public MetodoDePago getMetodoDePago() {
		return metodoDePago;
	}

	public void setMetodoDePago(MetodoDePago metodoDePago) {
		this.metodoDePago = metodoDePago;
	}
	

	public double costo() {
		return this.getActividadActual().costoConMetodoDePago(getMetodoDePago());
	}
	
	
	
}


