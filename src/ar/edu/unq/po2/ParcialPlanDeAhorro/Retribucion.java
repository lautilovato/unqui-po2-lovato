package ar.edu.unq.po2.ParcialPlanDeAhorro;

abstract class Retribucion {

	Consesionaria consesionaria;
	
	public Retribucion(Consesionaria consesionaria) {
		this.consesionaria = consesionaria;
	}
	
	abstract void ejecutar();

	public Consesionaria getConsesionaria() {
		return consesionaria;
	}

	public void setConsesionaria(Consesionaria consesionaria) {
		this.consesionaria = consesionaria;
	}
	
	
}
