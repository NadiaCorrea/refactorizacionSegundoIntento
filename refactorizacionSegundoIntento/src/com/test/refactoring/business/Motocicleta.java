package com.test.refactoring.business;

/**
 * Clase Motocicleta representa un Veh�culo de tipo Motocicleta
 * @author Nadia Correa 
 * @version 1.2
 */
public class Motocicleta extends Vehiculo{
	/**
	 * Cilindrada  de la Motocicleta
	 */
	private Integer cilindrada;
	
	/**
	 * Contructor con todos los par�metros
	 * @param matricula - Matr�cula del veh�culo
	 * @param color - Color del veh�culo
	 * @param combustible - Tipo de combustible que usa el veh�culo
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
	 * M�todo para obtener la ciclindrada
	 * @return Devuelve la cilindrada
	 */
	public Integer getCilindrada() {
		return cilindrada;
	}

	/**
	 * M�todo para asignar la ciclindrada
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
