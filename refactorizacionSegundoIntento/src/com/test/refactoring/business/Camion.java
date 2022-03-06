package com.test.refactoring.business;
/**
 * Clase Camion representa un Veh�culo de tipo Cami�n
 * @author Nadia Correa 
 * @version 1.2
 */
public class Camion extends Vehiculo {
	/**
	 * Tipo de carnet necesario para conducir el Cami�n
	 */
	private String tipoCarnet;

	/**
	 * Constructor sin par�metros
	 */
	public Camion() {
		super();
	}
	
	/**
	 * Constructor del objeto Cami�n que recibe todos los par�metros 
	 * @param matricula - Matr�cula del veh�culo
	 * @param color - Color del veh�culo
	 * @param combustible - Tipo de combustible que usa el veh�culo
	 * @param tipoCarnet - Tipo de carnet necesario para conducir el Cami�n
	 * @param nombreConductor - Nombre del conductor 
	 * @param dniConductor - DNI del conductor
	 */
	public Camion(String matricula, String color, String combustible, String tipoCarnet, String nombreConductor, String dniConductor) {
		super(matricula, color, combustible, nombreConductor, dniConductor);
		this.tipoCarnet = tipoCarnet;	
	}
	
	/**
	 * M�todo para obtener el tipo de carnet del conductor
	 * @return Devuelve el tipo de carnet
	 */
	public String getTipoCarnet() {
		return tipoCarnet;
	}
	
	/**
	 *  M�todo para asignar el tipo de carnet del conductor
	 * @param tipoCarnet - Tipo de carnet a asignar
	 */
	public void setTipoCarnet(String tipoCarnet) {
		this.tipoCarnet = tipoCarnet;
	}
	
	@Override
	public void acelerar(Integer velocidad) {
		System.out.println("La aceleraci�n del cami�n se realizar� progresivamente para conservar sus neum�ticos");
		
		//TO DO
		//Incluir l�gica de movimiento
	}

	@Override
	public void detener() {
		System.out.println("CUIDADO!! La detenci�n de un veh�culo de gran tama�o puede ocasionar accidentes de tr�fico");
	}

	
	@Override
	public String toString() {
		return "Camion [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", tipoCarnet="
				+ tipoCarnet + ", nombre_conductor=" + persona.getNombreConductor() + ", dniConductor=" + persona.getDniConductor() + "]";
	}
	
}
