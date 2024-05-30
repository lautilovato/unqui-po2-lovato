package ar.edu.unq.po2.ParcialEmpresaDeViajes;

import java.time.*;

public interface IOperator {
	
	public float taxes(String nombreAeropuereto, LocalDate date);
}
