package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	
	public Supermercado(String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
		
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public int cantidadDeProductosComersializados() {
		return this.getProductos().size();
	}

	public List<Producto> getProductos() {
		return productos;
	}
	
	public double sumaDePreciosDeProductos() {
		double precioTotal = 0;
		for(Producto producto:this.getProductos()) {
			precioTotal = precioTotal + producto.getPrecio();
		}
		return precioTotal;
	}
}
