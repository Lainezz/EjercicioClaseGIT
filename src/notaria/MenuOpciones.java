package notaria;

import java.util.Scanner;

public class MenuOpciones { // clase que contien el menu de opciones

	String msg = "****************Ingrese la Opcion****************";

	/**
	 * Método que muestra por pantalla el menú de opciones disponible para nuestra
	 * aplicación. Además, tiene que leer lo que el usuario introduce por teclado y
	 * devolver eso que ha introducido el usuario. Resumen: Muestra un menú de
	 * opciones, le pide al usuario que introduzca una opción, lee lo que el usuario
	 * ha introducido, y el método lo devuelve.
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
		//Opcion que devuelve el método. Esta opción la actualiza el usuario cuando leemos lo que introduce por teclado.
		Scanner scan = new Scanner(System.in);
		int opcion = 0;
		boolean opcionCorrecta= false;
		while (!opcionCorrecta) {
			try {
			//TODO sysos con el menu
			System.out.println("Introduzca el numero por teclado, que desee hacer. ");
			//TODO leer por teclado lo que el user introduce
			opcion=scan.nextInt();
			
			switch (opcion) {
			case 1:
				opcionCorrecta = true;
				System.out.println("Crear Tablas");
				break;
			case 2:
				opcionCorrecta = true;
				System.out.println("Ingresar Datos");
				break;
			case 3:
				opcionCorrecta = true;
				System.out.println("Consulta general");
				break;
			case 4:
				opcionCorrecta = true;
				System.out.println("Consulta documento determinado");
				break;
			case 5:
				opcionCorrecta = true;
				System.out.println("Actualizacion cliente");
				break;
			case 6:
				opcionCorrecta = true;
				System.out.println("Eliminar tablas");
				break;
			case 7:
				opcionCorrecta = true;
				System.out.println("EXIT");
				break;
			default:
				opcionCorrecta = false;
				System.out.println("MAL");
				break;
			}
		} catch (Exception e) {
			//TODO si el usuario introduce algo que no es un número, se controla la excepción
			System.out.println("FATAL");
			
		}
		}
		return opcion;
	}
}
