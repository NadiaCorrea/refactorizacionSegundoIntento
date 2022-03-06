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
	 * Método para obtener la hora actual
	 * @return Devuelve la hora actual
	 */
	public static String obtenerHoraActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	  * Método para obtener la fecha actual
	 * @return Devuelve la fecha actual
	 */
	public static String obtenerFechaActual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	
	/**
	 * Método para calcular el precio del alquiler de los días que se le pasan como parámetro
	 * @param dias - Días que estará en alquiler
	 * @return Devuelve el precio del alquiler para los días indicados
	 */
	public static float calcularPrecioAlquiler (Integer dias) {
		float result = 0;
		//El coste de un día de alquiler son 50€ + 21% de IVA
		result = (float) (dias * 50 * IVA);
		return result;
	}
	
	/**
	 * Método para calcular el precio del alquiler de los meses que se le pasan por paraámetros 
	 * @param meses - Meses que estraá en alquiler
	 * @return Devuelve el precio del alquiler para los meses indicados
	 */
	public static float calcularPrecioRenting (Integer meses ) {
		//El coste de un mes de renting son 750€ + 21% IVA
		return (float) (meses * 750 * IVA);
	}

}
