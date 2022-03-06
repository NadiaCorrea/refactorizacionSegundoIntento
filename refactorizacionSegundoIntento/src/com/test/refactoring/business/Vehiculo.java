package com.test.refactoring.business;
/**
 * Clase Veh�culo que representa un veh�culo cualquiera
 * @author Nadia Correa
 * @version 1.2
 *
 */
public abstract class Vehiculo {

	/**
	 * Matr�cula del veh�culo
	 */
	protected String matricula;
	
	/**
	 * Color del veh�culo
	 */
	protected String color;
	
	/**
	 * Combustible del veh�culo
	 */
	protected String combustible;
	
	/**
	 * Persona que conduce el veh�culo
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
	 * @param matricula - Matr�cula del veh�culo
	 * @param color - Color del veh�culo
	 * @param combustible - Tipo de combustible que usa el veh�culo
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
	 * M�todo para obtener la matr�cula del veh�culo
	 * @return Devuelve la matr�cula del veh�culo
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * M�todo para asignar la matr�cula del veh�culo
	 * @param matricula Matr�cula a asignar
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * M�todo para obtener el color del veh�culo
	 * @return Devuelve el color del veh�culo
	 */
	public String getColor() {
		return color;
	}

	
	/**
	 * M�todo para asignar el color del veh�culo
	 * @param color Color a asignar
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * M�todo para obtener el tipo de combustible del veh�culo
	 * @return
	 */
	public String getCombustible() {
		return combustible;
	}

	/**
	 * M�todo para asignar el tipo de combustible del veh�culo
	 * @param combustible - Combustible a asignar
	 */
	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	/**
	 * M�todo para obtener la persona que conduce el veh�culo
	 * @return Devuleve la persona que conduce el veh�culo
	 */
	public Persona getPersona() {
		return persona;
	}

	/**
	 * M�todo para asignar a la persona que conduce el veh�culo
	 * @param persona Persona que conduce el veh�culo
	 */
	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	/**
	 * M�todo que permite acelerar el veh�culo
	 * @param velocidad - Velocidad a la que producir� la aceleraci�n
	 */
	public abstract void acelerar(Integer velocidad);

	/**
	 * M�todo para detener al veh�culo
	 */
	public abstract void detener();

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", color=" + color + ", combustible=" + combustible + ", persona="
				+ persona.toString() + "]";
	}
	
	
}