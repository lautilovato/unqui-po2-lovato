package ar.edu.unq.po2.ParcialEmpresaIngenieria;

public class MetodoMercadoPago implements MetodoDePago{

	public MetodoMercadoPago() {
		
	}
	
	public double ajustarPrecio(double monto) {
		return monto - (monto * 0.03);
	}
	
}
