package ar.edu.unq.po2.ParcialEmpresaIngenieria;

public class Material {

	private int cantidad;
	private double precio;
	
	public Material(int cantidad, double precio) {
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public int getCantidad() {
		return cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public double getCosto() {
		return this.getCantidad() * this.getPrecio();
	}
	
}
