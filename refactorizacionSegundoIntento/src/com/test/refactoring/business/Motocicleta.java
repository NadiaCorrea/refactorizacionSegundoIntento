package com.test.refactoring.business;

/**
 * Clase Motocicleta representa un Vehículo de tipo Motocicleta
 * @author Nadia Correa 
 * @version 1.2
 */
public class Motocicleta extends Vehiculo{
	/**
	 * Cilindrada  de la Motocicleta
	 */
	private Integer cilindrada;
	
	/**
	 * Contructor con todos los parámetros
	 * @param matricula - Matrícula del vehículo
	 * @param color - Color del vehículo
	 * @param combustible - Tipo de combustible que usa el vehículo
	 * @param cilindrada - Cilindrada  de la Motocicleta
	 * @param nombreConductor - Nombre del conductor 
	 * @param dniConductor - DNI del conductor
	 */
	public Motocicleta(String matricula, String color, String combustible, Integer cilindrada, String nombreConductor,
			String dniConductor) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.cilindrada = cilindrada;
	}

	/**
	 * Método para obtener la ciclindrada
	 * @return Devuelve la cilindrada
	 */
	public Integer getCilindrada() {
		return cilindrada;
	}

	/**
	 * Método para asignar la ciclindrada
	 * @param cilindrada
	 */
	public void setCilindrada(Integer cilindrada) {
		this.cilindrada = cilindrada;
	}

	@Override
	public void acelerar(Integer velocidad) {
		//TO DO
	}
	
	@Override
	public void detener() {
		//TO DO
	}

	@Override
	public String toString() {
		return "motocicleta [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible
				+ ", cilindrada=" + cilindrada + ", nombre_conductor=" + persona.getNombreConductor() + ", dniConductor="
				+ persona.getDniConductor() + "]";
	}	

}
