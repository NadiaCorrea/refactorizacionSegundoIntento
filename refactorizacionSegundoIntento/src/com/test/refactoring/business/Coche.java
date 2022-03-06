package com.test.refactoring.business;
/**
 * Clase Coche representa un Vehículo de tipo Coche
 * @author Nadia Correa 
 * @version 1.2
 */
public class Coche extends Vehiculo {
	/**
	 * Número de plazas de las que dispone el coche
	 */
	private Integer numPlazas;
	
	/**
	 * Constructor sin parámetros
	 */
	public Coche() {
		super();
	}
		
	/**
	 * 
	 * Constructor del objeto Coche que recibe todos los parámetros 
	 * @param matricula - Matrícula del vehículo
	 * @param color - Color del vehículo
	 * @param combustible - Tipo de combustible que usa el vehículo
	 * @param numPlazas - Número de plazas de las que dispone el Coche
	 * @param nombreConductor - Nombre del conductor 
	 * @param dniConductor - DNI del conductor
	 */
	public Coche(String matricula, String color, String combustible, Integer numPlazas, String nombre_conductor, String dniConductor) {
		super(matricula, color, combustible, nombre_conductor, dniConductor);
		this.numPlazas =  numPlazas;
	}
	
	/**
	 * Método para obtener el número de plazas 
	 * @return Devuelve el número de plazas
	 */
	public Integer getNumPlazas() {
		return numPlazas;
	}
	
	/**
	 *  Método para asignar el número de plazas 
	 * @param numPlazas - Número de plazas a asignar
	 */
	public void setNumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	@Override
	public void acelerar(Integer velocidad) {
		if (velocidad > 0 && velocidad < 120) {
			System.out.println("El coche está acelerando y llegará la velocidad de " + velocidad.intValue() + " km/h");
		} else {
			System.out.println("La velocidad indicada no está permitida en un coche según la DGT");
		}
	}

	@Override
	public void detener() {
		System.out.println("El coche se detendrá en breve, asegúrese de buscar un lugar adecuado para estacionar");
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", numPlazas="
				+ numPlazas + ", nombre_conductor=" + persona.getNombreConductor() + ", dniConductor=" + persona.getDniConductor() + "]";
	}

}
