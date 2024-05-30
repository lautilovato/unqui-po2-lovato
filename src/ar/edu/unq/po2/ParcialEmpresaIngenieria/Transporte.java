package ar.edu.unq.po2.ParcialEmpresaIngenieria;

public class Transporte implements Actividad{
	
	private int distancia;
	private double pesoDeCarga;
	private double precio;
	
	public Transporte(int distancia, double pesoDeCarga, double precio) {
		this.distancia = distancia;
		this.pesoDeCarga = pesoDeCarga;
		this.precio = precio;
	}
	
	public double costoConMetodoDePago(MetodoDePago metodoDePago) {
		return this.pesoDeCarga * this.precio * this.distancia;
	}
}
