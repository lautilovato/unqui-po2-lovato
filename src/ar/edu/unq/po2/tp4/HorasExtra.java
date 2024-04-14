package ar.edu.unq.po2.tp4;

public class HorasExtra{
	
	private int cantidad;
	private double pagoPorHora;
	
	HorasExtra(int cantidad, double pagoPorHora){
		this.cantidad = cantidad;
		this.pagoPorHora = pagoPorHora;
	}

	public double getMonto() {
		return this.getCantidad() * this.getPagoPorHora();
	}
	public int getCantidad() {
		return cantidad;
	}
	
	public double getPagoPorHora() {
		return pagoPorHora;
	}
}
