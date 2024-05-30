package ar.edu.unq.po2.ParcialEmpresaDeViajes;

import java.util.ArrayList;
import java.util.List;


public class EmpresaDeViajes {
	
	private List<ProductoTuristico> productosContratados = new ArrayList<ProductoTuristico>();

	
	public EmpresaDeViajes(List<ProductoTuristico> productosContratados) {
		this.productosContratados = productosContratados;
		
	}
	
	public List<ProductoTuristico> getProductosContratados() {
		return productosContratados;
	}
	
	public double getCostoProductosContratados() {
		return this.getProductosContratados().stream().mapToDouble(p -> p.getCosto()).sum();
	}
}
