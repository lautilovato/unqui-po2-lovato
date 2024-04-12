package ar.edu.unq.po2.tp4;

public class Producto {
	
	protected String nombre;
	protected double precio;
	
	public Producto(){
		
	}
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}

	

}


