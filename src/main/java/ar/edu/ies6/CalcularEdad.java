package ar.edu.ies6;

import java.time.LocalDate;
import java.time.Period;

public class CalcularEdad {
	
	public static int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        return periodo.getYears();
        
	}
	

}
