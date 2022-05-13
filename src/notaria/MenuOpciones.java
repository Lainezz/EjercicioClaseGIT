package notaria;

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
		int opcion = 0;
		try {
			//TODO sysos con el menu
			
			//TODO leer por teclado lo que el user introduce
			
		} catch (Exception e) {
			//TODO si el usuario introduce algo que no es un número, se controla la excepción
			
		}
		return opcion;
	}
}
