package ar.edu.ies6.model;

import java.time.LocalDate;
import java.time.Period;

public class CalcularEdad {
	
	public static int calcularEdad(LocalDate fechaNac) {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNac, fechaActual);
        return periodo.getYears();
	}	
}
