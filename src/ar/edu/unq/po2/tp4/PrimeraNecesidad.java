package ar.edu.unq.po2.tp4;

public class PrimeraNecesidad extends Producto {
	
	private double descuento;

	public PrimeraNecesidad(String nombre, double precio, float procentajeDeDescuento) {
		
		super(nombre, precio);
		this.descuento = procentajeDeDescuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public double getPrecioBase() {
		return precio;
	}
	
	public double getPrecio() {
		double precioFinal = this.getPrecioBase() - this.getPrecioBase() * (this.getDescuento() / 100);
		return precioFinal;
	}
	
}
