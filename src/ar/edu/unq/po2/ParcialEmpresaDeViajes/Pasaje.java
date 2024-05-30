package ar.edu.unq.po2.ParcialEmpresaDeViajes;

import java.time.LocalDate;

public class Pasaje extends ProductoTuristico implements IOperator{

	private double precioPorPersona;
	private int cantidadDePersonas;
	private String aeropuertoDeLlegada;
	
	public Pasaje(LocalDate fechaInicio, LocalDate fechaFin, double precioPorPersona, int cantidadDePersonas,String aeropuertoDeLlegada) {
		
		super(fechaInicio, fechaFin);
		this.precioPorPersona = precioPorPersona;
		this.cantidadDePersonas = cantidadDePersonas;
		this.aeropuertoDeLlegada = aeropuertoDeLlegada;
	}

	public double getPrecioPorPersona() {
		return precioPorPersona;
	}

	public int getCantidadDePersonas() {
		return cantidadDePersonas;
	}

	public String getAeropuertoDeLlegada() {
		return aeropuertoDeLlegada;
	}
	
	public float taxes(String nombreAeropuereto, LocalDate date) {
		return 0;
	}
	
	public double getCosto() {
		return ( this.getPrecioPorPersona() * this.getCantidadDePersonas() ) + this.taxes(getAeropuertoDeLlegada(), getFechaInicio());
	}
}
