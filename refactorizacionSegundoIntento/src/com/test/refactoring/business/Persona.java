package com.test.refactoring.business;
/**
 * Clase Persona que representa a una persona
 * @author Nadia Correa
 * @version 1.2
 */
public class Persona {
	/**
	 * Nombre del conductor 
	 */
	private String nombreConductor;
	/**
	 * DNI del constructor
	 */
	private String dniConductor;

	/**
	 * Constructor sin parametros
	 */
	public Persona() {
	}

	/**
	 * M�todo para obtener el nombre del conductor 
	 * @return Devuelve el nombre del conductor
	 */
	public String getNombreConductor() {
		return nombreConductor;
	}

	/**
	 * M�todo para asignar el nombre del conductor
	 * @param nombreConductor Nombre del conductor a asignar
	 */
	public void setNombreConductor(String nombreConductor) {
		this.nombreConductor = nombreConductor;
	}

	/**
	 * M�todo para obtener el DNI del conductor
	 * @return Devuelve el DNI del conductor
	 */
	public String getDniConductor() {
		return dniConductor;
	}

	/**
	 * M�todo para asignar el DNI del conductor
	 * @param dniConductor - DNI a asignar
	 */
	public void setDniConductor(String dniConductor) {
		this.dniConductor = dniConductor;
	}

	@Override
	public String toString() {
		return "Persona [nombreConductor=" + nombreConductor + ", dniConductor=" + dniConductor + "]";
	}
		
}