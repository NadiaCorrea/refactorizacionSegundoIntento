package com.test.refactoring.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * Clase de utilidades
 * @author Nadia Correa
 * @version 1.2
 */
public class Utils {
	/**
	 * Constante que representa el valor del IVA del 21% 
	 */
	public static final double IVA = 1.21;
	
	/**
	 * M�todo para obtener la hora actual
	 * @return Devuelve la hora actual
	 */
	public static String obtenerHoraActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	  * M�todo para obtener la fecha actual
	 * @return Devuelve la fecha actual
	 */
	public static String obtenerFechaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * M�todo para calcular el precio del alquiler de los d�as que se le pasan como par�metro
	 * @param dias - D�as que estar� en alquiler
	 * @return Devuelve el precio del alquiler para los d�as indicados
	 */
	public static float calcularPrecioAlquiler (Integer dias) {
		float result = 0;
		//El coste de un d�a de alquiler son 50� + 21% de IVA
		result = (float) (dias * 50 * IVA);
		return result;
	}
	
	/**
	 * M�todo para calcular el precio del alquiler de los meses que se le pasan por para�metros 
	 * @param meses - Meses que estra� en alquiler
	 * @return Devuelve el precio del alquiler para los meses indicados
	 */
	public static float calcularPrecioRenting (Integer meses ) {
		//El coste de un mes de renting son 750� + 21% IVA
		return (float) (meses * 750 * IVA);
	}

}
