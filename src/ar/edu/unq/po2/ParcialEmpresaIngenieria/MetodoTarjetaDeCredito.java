package ar.edu.unq.po2.ParcialEmpresaIngenieria;

public class MetodoTarjetaDeCredito implements MetodoDePago{
	
	private int cuotas;
	
	public MetodoTarjetaDeCredito(int cuotas) {
		this.cuotas = cuotas;
	}
	
	public int getCuotas() {
		return cuotas;
	}

	public double porcentajeExtra() {
		return this.getCuotas() * 4;
	}
	
	public double ajustarPrecio(double monto) {
		return monto + (monto * this.porcentajeExtra() / 100);
	}
	
	

}
