package ar.edu.unq.po2.ParcialPlanDeAhorro;

public class AutoFisico extends Retribucion{
	
	private String marca;
	private String modelo;
	
	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}
	
	public AutoFisico(Consesionaria consesionaria, String marca, String modelo) {
		super(consesionaria);
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public void ejecutar() {
		this.getConsesionaria().getFabricaAutomotriz().comprarAutomovil(this.getMarca(), this.getModelo());
	}
}
