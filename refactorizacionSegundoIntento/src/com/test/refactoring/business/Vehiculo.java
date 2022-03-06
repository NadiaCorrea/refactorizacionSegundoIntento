package com.test.refactoring.business;
/**
 * Clase Vehículo que representa un vehículo cualquiera
 * @author Nadia Correa
 * @version 1.2
 *
 */
public abstract class Vehiculo {

	/**
	 * Matrícula del vehículo
	 */
	protected String matricula;
	
	/**
	 * Color del vehículo
	 */
	protected String color;
	
	/**
	 * Combustible del vehículo
	 */
	protected String combustible;
	
	/**
	 * Persona que conduce el vehículo
	 */
	protected Persona persona = new Persona();

	/**
	 * Constructor sin parametros
	 */
	public Vehiculo() {
		super();
	}
	
	/**
	 * Constructor con todos los parametros
	 * @param matricula - Matrícula del vehículo
	 * @param color - Color del vehículo
	 * @param combustible - Tipo de combustible que usa el vehículo
	 * @param nombreConductor - Nombre del conductor 
	 * @param dniConductor - DNI del conductor
	 */
	public Vehiculo(String matricula, String color, String combustible, String nombreConductor, String dniConductor) {
		super();
		this.matricula = matricula;
		this.color = color;
		this.combustible = combustible;
		this.persona.setNombreConductor(nombreConductor);
		this.persona.setDniConductor(dniConductor);
	}

	/**
	 * Método para obtener la matrícula del vehículo
	 * @return Devuelve la matrícula del vehículo
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Método para asignar la matrícula del vehículo
	 * @param matricula Matrícula a asignar
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Método para obtener el color del vehículo
	 * @return Devuelve el color del vehículo
	 */
	public String getColor() {
		return color;
	}

	
	/**
	 * Método para asignar el color del vehículo
	 * @param color Color a asignar
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Método para obtener el tipo de combustible del vehículo
	 * @return
	 */
	public String getCombustible() {
		return combustible;
	}

	/**
	 * Método para asignar el tipo de combustible del vehículo
	 * @param combustible - Combustible a asignar
	 */
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	/**
	 * Método para obtener la persona que conduce el vehículo
	 * @return Devuleve la persona que conduce el vehículo
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * Método para asignar a la persona que conduce el vehículo
	 * @param persona Persona que conduce el vehículo
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	/**
	 * Método que permite acelerar el vehículo
	 * @param velocidad - Velocidad a la que producirá la aceleración
	 */
	public abstract void acelerar(Integer velocidad);

	/**
	 * Método para detener al vehículo
	 */
	public abstract void detener();

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", persona="
				+ persona.toString() + "]";
	}
	
	
}