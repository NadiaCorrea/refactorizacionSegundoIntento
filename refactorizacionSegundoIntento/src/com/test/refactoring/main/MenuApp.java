package com.test.refactoring.main;

import java.util.Random;
import java.util.Scanner;

import com.test.refactoring.business.Camion;
import com.test.refactoring.business.Coche;
import com.test.refactoring.business.Vehiculo;
import com.test.refactoring.utils.Utils;
/**
 * Clase MenuApp clase de ejecuci�n principal del programa
 * @author Nadia Correa
 * @version 1.2
 */
public class MenuApp {

	/**
	 * M�todo de ejecuci�n principal del programas
	 * @param args Argumentos de entrada para la ejecuci�n del programa
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		mostrarPresentacion();
		
		System.out.println("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		System.out.println("Introduce tu primer apellido: ");
		String primerApellido = sc.nextLine();
		
		mostrarBienvenida(nombre, primerApellido);
		
		System.out.println("Introduce el n�mero de coches : ");
		int numCoches= sc.nextInt();
		Coche[] listaCoches = new Coche[numCoches];
		acelerarVehiculos(listaCoches);
		
		System.out.println("Introduce el n�mero de camiones : ");
		int numCamiones= sc.nextInt();
		Vehiculo[] listaCamiones = new Vehiculo[numCamiones];
		acelerarVehiculos(listaCamiones);
		
		detenerVehiculos(listaCoches);
		detenerVehiculos(listaCamiones);
		
		sc.close();
		
	}

	/**
	 * M�todo que muestra la presentaci�n del programa
	 */
	private static void mostrarPresentacion () {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/***     VAMOS A REFACTORIZAR...HAY QUE ELIMINAR LOS MALOS OLORES YA!!       ***/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
	}

	/**
	 * 	M�todo que da la bienvenida al usuario 
	 * @param nombre - Nombre del usuario
	 * @param primerApellido - Primer apellido del usuario
	 */
	private static void mostrarBienvenida(String nombre, String primerApellido) {
		System.out.println("/*******************************************************************************/");
		System.out.println("/***                                                                         ***/");
		System.out.println("/*** BIENVENIDO/A " + nombre + " " + primerApellido);
		System.out.println("/*** " + Utils.obtenerFechaActual() );
		System.out.println("/*** " + Utils.obtenerHoraActual() );
		System.out.println("/***                                                                         ***/");
		System.out.println("/*******************************************************************************/");
			
	}
	
	/**
	 * M�todo para detener a los veh�culos de tipo Coche
	 * @param listaCoches - Listado de coches
	 */
	private static void detenerVehiculos(Coche[] listaCoches) {
		for (int i=0; i<listaCoches.length; i++) {
			listaCoches[i].detener();
		}
	}
	
	
	/**
	 * M�todo para detener a los veh�culos de tipo Cami�n
	 * @param listaCamiones - Listado de camiones
	 */
	private static void detenerVehiculos(Vehiculo[] listaCamiones) {
		for (int i=0; i<listaCamiones.length; i++) {
			listaCamiones[i].detener();
		}
	}
	
	/**
	 * M�todo para acelerar a los veh�culos de tipo Coche
	 * @param listaCoches - Listado de coches
	 */
	private static void acelerarVehiculos(Coche[] listaCoches) {
		for (int i=0; i<listaCoches.length; i++) {
			listaCoches[i] = new Coche();
			listaCoches[i].acelerar(10);
		}
	}

	/**
	 * M�todo para acelerar a los veh�culos de tipo Cami�n
	 * @param listaCamiones - Listado de camiones
	 */
	private static void acelerarVehiculos(Vehiculo[] listaCamiones) {
		for (int i=0; i<listaCamiones.length; i++) {
			listaCamiones[i] = new Camion();
			listaCamiones[i].acelerar(10);
		}
	}

}









