package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresosPercibidosAnuales = new ArrayList<Ingreso>();
	private List<HorasExtra> horasExtras = new ArrayList<HorasExtra>();
	
	public Trabajador() {
		
	}
	
	public Trabajador(List<Ingreso> ingresosAnuales) {
		this.ingresosPercibidosAnuales = ingresosAnuales;
	}

	public List<Ingreso> getIngresosPercibidosAnuales() {
		return ingresosPercibidosAnuales;
	}

	
	public List<HorasExtra> getHorasExtras() {
		return horasExtras;
	}
	
	public void agregarHorasExtra(HorasExtra horasExtra) {
		horasExtras.add(horasExtra);
	}

	public double getMontoImponible() {
		double montoTotal = 0;
		for(Ingreso ingreso :this.getIngresosPercibidosAnuales()) {
			montoTotal = montoTotal + ingreso.getMonto();
		}
		return montoTotal;
	}
	
	public double getMontoPorHorasExtra() {
		double montoTotal = 0;
		for(HorasExtra horasExtras :this.getHorasExtras()) {
			montoTotal = montoTotal + horasExtras.getMonto();
		}
		return montoTotal;
	}
	
	public double getTotalPercibido() {	
		return this.getMontoImponible() + this.getMontoPorHorasExtra();
		
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}

}
