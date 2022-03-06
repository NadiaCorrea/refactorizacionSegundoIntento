package com.test.refactoring.business;
/**
 * Clase Coche representa un Veh�culo de tipo Coche
 * @author Nadia Correa 
 * @version 1.2
 */
public class Coche extends Vehiculo {
	/**
	 * N�mero de plazas de las que dispone el coche
	 */
	private Integer numPlazas;
	
	/**
	 * Constructor sin par�metros
	 */
	public Coche() {
		super();
	}
		
	/**
	 * 
	 * Constructor del objeto Coche que recibe todos los par�metros 
	 * @param matricula - Matr�cula del veh�culo
	 * @param color - Color del veh�culo
	 * @param combustible - Tipo de combustible que usa el veh�culo
	 * @param numPlazas - N�mero de plazas de las que dispone el Coche
	 * @param nombreConductor - Nombre del conductor 
	 * @param dniConductor - DNI del conductor
	 */
	public Coche(String matricula, String color, String combustible, Integer numPlazas, String nombre_conductor, String dniConductor) {
		super(matricula, color, combustible, nombre_conductor, dniConductor);
		this.numPlazas =  numPlazas;
	}
	
	/**
	 * M�todo para obtener el n�mero de plazas 
	 * @return Devuelve el n�mero de plazas
	 */
	public Integer getNumPlazas() {
		return numPlazas;
	}
	
	/**
	 *  M�todo para asignar el n�mero de plazas 
	 * @param numPlazas - N�mero de plazas a asignar
	 */
	public void setNumPlazas(Integer numPlazas) {
		this.numPlazas = numPlazas;
	}
	
	@Override
	public void acelerar(Integer velocidad) {
		if (velocidad > 0 && velocidad < 120) {
			System.out.println("El coche est� acelerando y llegar� la velocidad de " + velocidad.intValue() + " km/h");
		} else {
			System.out.println("La velocidad indicada no est� permitida en un coche seg�n la DGT");
		}
	}

	@Override
	public void detener() {
		System.out.println("El coche se detendr� en breve, aseg�rese de buscar un lugar adecuado para estacionar");
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", numPlazas="
				+ numPlazas + ", nombre_conductor=" + persona.getNombreConductor() + ", dniConductor=" + persona.getDniConductor() + "]";
	}

}
