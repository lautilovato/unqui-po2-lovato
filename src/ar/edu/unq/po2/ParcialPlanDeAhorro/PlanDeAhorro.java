package ar.edu.unq.po2.ParcialPlanDeAhorro;

public class PlanDeAhorro {

	private Cliente titular; 
	private String marca;
	private String modelo; 
	private int cuotas;
	private String cbuTitular; 
	private int cuotasPagas; 
	private Retribucion retribucion;
	private Consesionaria consesionaria;
	private EstadoPlanDeAhorro estadoDelPlan;
	
	public PlanDeAhorro(Cliente titular, String marca, String modelo, int cuotas, Consesionaria consesionaria) {
		this.titular = titular;
		this.marca = marca;
		this.modelo = modelo;
		this.cuotas = cuotas;
		this.cbuTitular = titular.getCbu();
		this.cuotasPagas = 0;
		this.consesionaria = consesionaria;
		this.estadoDelPlan = new Creado();
	}
	
	
	public int getCuotasPagas() {
		return cuotasPagas;
	}


	public void setCuotasPagas(int cuotasPagas) {
		this.cuotasPagas = cuotasPagas;
	}

	public Retribucion getRetribucion() {
		return retribucion;
	}
	
	public void  setRetribucion(Retribucion retribucion) {
		this.retribucion = retribucion;
	}

	public EstadoPlanDeAhorro getEstadoDelPlan() {
		return estadoDelPlan;
	}

	public void setEstadoDelPlan(EstadoPlanDeAhorro estadoDelPlan) {
		this.estadoDelPlan = estadoDelPlan;
	}

	public Cliente getTitular() {
		return titular;
	}


	public String getMarca() {
		return marca;
	}


	public String getModelo() {
		return modelo;
	}


	public int getCuotas() {
		return cuotas;
	}


	public String getCbuTitular() {
		return cbuTitular;
	}


	public Consesionaria getConsesionaria() {
		return consesionaria;
	}


	public void setearRetribucion(Retribucion retribucion) {
		
		this.getEstadoDelPlan().setearRetribucion(this, retribucion);
	}	

	
	public void pagarCuota() {
		this.getEstadoDelPlan().pagarCuota(this);
	}


	public void ejecutarRetribucion(){
		this.getEstadoDelPlan().ejecutarRetribucion(this);
	}
}
