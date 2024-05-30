package ar.edu.unq.po2.ParcialEmpresaDeViajes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Paquete extends ProductoTuristico{
	
	private List<ProductoTuristico> productosContratados = new ArrayList<ProductoTuristico>();
	private double porcentajeCostoGestion;
	
	public Paquete(LocalDate fechaInicio, LocalDate fechaFin, List<ProductoTuristico> productosContratados, double porcentajeCostoGestion) {
		super(fechaInicio, fechaFin);
		this.productosContratados = productosContratados;
		this.porcentajeCostoGestion = porcentajeCostoGestion;
	}

	public List<ProductoTuristico> getProductosContratados() {
		return productosContratados;
	}
	
	public double getPorcentajeCostoGestion() {
		return porcentajeCostoGestion;
	}

	public double getCosto() {
		return this.getCostoFijo() + this.getCostoGestion();
	}
	
	//Suma de todos los costos de los productos de la lista
	public double getCostoFijo() {
		return this.getProductosContratados().stream()
				.mapToDouble(producto -> producto.getCosto())
				.sum();
	}
	
	public double getCostoGestion() {
		return this.getCostoFijo() * this.getPorcentajeCostoGestion() / 100;
	}
}
