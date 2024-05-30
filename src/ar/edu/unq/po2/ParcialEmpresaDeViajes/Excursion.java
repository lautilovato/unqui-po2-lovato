package ar.edu.unq.po2.ParcialEmpresaDeViajes;

import java.time.LocalDate;

public class Excursion extends ProductoTuristico{
	
	private double precioPorPersona;
	private int cantidadDePersonas;
	private double impuestos;

	public Excursion(LocalDate fechaInicio, LocalDate fechaFin, double precioPorPersona, int cantidadDePersonas, double impuestos) {
		super(fechaInicio, fechaFin);
		this.precioPorPersona = precioPorPersona;
		this.cantidadDePersonas = cantidadDePersonas;
		this.impuestos = impuestos;
	}

	public double getPrecioPorPersona() {
		return precioPorPersona;
	}

	public int getCantidadDePersonas() {
		return cantidadDePersonas;
	}
	
	public double getImpuestos() {
		return impuestos;
	}
	
	public double getCosto() {
		return ( this.getPrecioPorPersona() * this.getCantidadDePersonas() ) + this.getImpuestos() ;
	}
}

