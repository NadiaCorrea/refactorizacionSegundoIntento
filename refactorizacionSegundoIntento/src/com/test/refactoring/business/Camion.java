package com.test.refactoring.business;
/**
 * Clase Camion representa un Vehículo de tipo Camión
 * @author Nadia Correa 
 * @version 1.2
 */
public class Camion extends Vehiculo {
	/**
	 * Tipo de carnet necesario para conducir el Camión
	 */
	private String tipoCarnet;

	/**
	 * Constructor sin parámetros
	 */
	public Camion() {
		super();
	}
	
	/**
	 * Constructor del objeto Camión que recibe todos los parámetros 
	 * @param matricula - Matrícula del vehículo
	 * @param color - Color del vehículo
	 * @param combustible - Tipo de combustible que usa el vehículo
	 * @param tipoCarnet - Tipo de carnet necesario para conducir el Camión
	 * @param nombreConductor - Nombre del conductor 
	 * @param dniConductor - DNI del conductor
	 */
	public Camion(String matricula, String color, String combustible, String tipoCarnet, String nombreConductor, String dniConductor) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.tipoCarnet = tipoCarnet;	
	}
	
	/**
	 * Método para obtener el tipo de carnet del conductor
	 * @return Devuelve el tipo de carnet
	 */
	public String getTipoCarnet() {
		return tipoCarnet;
	}
	
	/**
	 *  Método para asignar el tipo de carnet del conductor
	 * @param tipoCarnet - Tipo de carnet a asignar
	 */
	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}
	
	@Override
	public void acelerar(Integer velocidad) {
		System.out.println("La aceleración del camión se realizará progresivamente para conservar sus neumáticos");
		
		//TO DO
		//Incluir lógica de movimiento
	}

	@Override
	public void detener() {
		System.out.println("CUIDADO!! La detención de un vehículo de gran tamaño puede ocasionar accidentes de tráfico");
	}

	
	@Override
	public String toString() {
		return "Camion [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", tipoCarnet="
				+ tipoCarnet + ", nombre_conductor=" + persona.getNombreConductor() + ", dniConductor=" + persona.getDniConductor() + "]";
	}
	
}
