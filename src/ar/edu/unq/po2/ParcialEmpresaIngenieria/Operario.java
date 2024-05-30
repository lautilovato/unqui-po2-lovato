package ar.edu.unq.po2.ParcialEmpresaIngenieria;

public class Operario {
	
	private int horasTrabajadas;
	private double valorPorHora;
	private int aniosAntiguedad;
	
	public Operario(int horasTrabajadas, double valorPorHora, int aniosAntiguedad) {
		
		this.horasTrabajadas = horasTrabajadas;
		this.valorPorHora = valorPorHora;
		this.aniosAntiguedad = aniosAntiguedad;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public int getAniosAntiguedad() {
		return aniosAntiguedad;
	}
	
	private double porcentajeExtraPorAntiguedad() {
		
		double porcentaje = 0;
		if(this.getAniosAntiguedad() >= 5) {
			porcentaje = 10;
		}
		return porcentaje;
	}
	
	public double getSueldo() {
		double sueldoBasico = this.getHorasTrabajadas() * this.getValorPorHora();
		return sueldoBasico + ( (sueldoBasico  * this.porcentajeExtraPorAntiguedad()) / 100 );
	}
}
