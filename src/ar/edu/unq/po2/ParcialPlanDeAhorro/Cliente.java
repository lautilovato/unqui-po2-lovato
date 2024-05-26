package ar.edu.unq.po2.ParcialPlanDeAhorro;

public class Cliente {

	private String cbu;
	private PlanDeAhorro planDeAhorro;
	
	public Cliente(String cbu) {
		this.cbu = cbu;
	}
	
	public String getCbu() {
		return cbu;
	}

	public PlanDeAhorro getPlanDeAhorro() {
		return planDeAhorro;
	}

	public void registrarPlanDeAhorro(String marca, String modelo, int cuotas, Consesionaria consesionaria) {
		this.planDeAhorro = new PlanDeAhorro(this,  marca,  modelo,  cuotas, consesionaria);
	}
	
	public void pagarCuota() {
		this.getPlanDeAhorro().pagarCuota();
	}
	
	public void setearRetribucion(Retribucion retribucion) {
		this.getPlanDeAhorro().setearRetribucion(retribucion);
	}
	
	public void ejecutarRetribucion() {
		this.getPlanDeAhorro().ejecutarRetribucion();
	}
	
	public int cuotasPendientes() {
		return this.getPlanDeAhorro().getCuotas() - this.getPlanDeAhorro().getCuotasPagas();
	}
}
