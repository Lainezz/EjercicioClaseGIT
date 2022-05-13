package notaria;

import java.sql.Connection;
import java.util.Scanner;

public class MenuOpciones { // clase que contien el menu de opciones
	
	String msg = "****************Ingrese la Opcion****************";

	/**
	 * M�todo que muestra por pantalla el men� de opciones disponible para nuestra
	 * aplicaci�n. Adem�s, tiene que leer lo que el usuario introduce por teclado y
	 * devolver eso que ha introducido el usuario. Resumen: Muestra un men� de
	 * opciones, le pide al usuario que introduzca una opci�n, lee lo que el usuario
	 * ha introducido, y el m�todo lo devuelve.
	 * 
	 * 
	 * TITULO DE LA APLICACION
	 * 
	 * (1). Crear tablas 
	 * (2). Ingresar datos 
	 * (3). Consulta general 
	 * (4). Consulta documento determinado 
	 * (5). Actualizacion cliente 
	 * (6). Eliminar tablas 
	 * (7). Salir
	 * 
	 * @return opcion lo que el usuario ha introducido por teclado. De tipo entero
	 * @author Conrado
	 */
	public int menuPrincipal() {
		//Opcion que devuelve el m�todo. Esta opci�n la actualiza el usuario cuando leemos lo que introduce por teclado.
		Scanner scan = new Scanner(System.in);
		String tablaCrear;
		int opcion = 0;
			try {
			//TODO sysos con el menu
			System.out.println("Introduzca el numero por teclado, que desee hacer. ");
			System.out.println("(1) Crear tablas. "
					+ "(2) Ingresar datos "
					+ "(3) Consulta general. "
					+ "(4) Consulta documento determinado. "
					+ "(5) Actualizacion cliente. "
					+ "(6) Eliminar tablas. "
					+ "(7) Salir. ");
			//TODO leer por teclado lo que el user introduce
			opcion=scan.nextInt();
		if (opcion ==1) {
			System.out.println("Creacion de tablas");
		}
		else if (opcion ==2) {
			System.out.println("Insertar datos");
		}
		else if (opcion ==3) {
			System.out.println("Consulta general");
		}
		else if (opcion ==4) {
			System.out.println("Consulta documento determinado");
		}
		else if (opcion ==5) {
			System.out.println("Actualizacion");
		}
		else if (opcion ==6) {
			System.out.println("Eliminar tablas");
		}
		else {
			
		}
		} catch (Exception e) {
			//TODO si el usuario introduce algo que no es un n�mero, se controla la excepci�n
			System.out.println("FATAL");
			
		}
		return opcion;
	}
}
