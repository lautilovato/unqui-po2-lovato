package ar.edu.unq.po2.ParcialPlanDeAhorro;

public class DepositoEfectivo extends Retribucion{

	private String marca;
	private String modelo;
	private String cbu;
	
	public DepositoEfectivo(Consesionaria consesionaria, String marca, String modelo, String cbu) {
		super(consesionaria);
		this.marca = marca;
		this.modelo = modelo;
		this.cbu = cbu;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getCbu() {
		return cbu;
	}
	
	public void ejecutar() {
		
		double montoADepositar = this.getConsesionaria().getFabricaAutomotriz().valuarAutomovil(this.getMarca(), this.getModelo());
		
		this.getConsesionaria().getRedBancaria().depositar(montoADepositar, this.getCbu());
	}
}
