package ar.edu.unq.po2.ParcialEmpresaDeViajes;

import java.time.*;
abstract class ProductoTuristico {

	private LocalDate fechaInicio ;
	private LocalDate fechaFin;
	
	public ProductoTuristico(LocalDate fechaInicio, LocalDate fechaFin) {
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public LocalDate getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	
	abstract double getCosto();
	
	
}
