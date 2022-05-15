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
	 * @author Diego
	 */
	public int menuPrincipal() {
		int opcion=0;
        try {
            System.out.println("\n\n----------------------------------------------------");
            System.out.println("*** NOTARIA DEL ESTADO ***");
            System.out.println("----------------------------------------------------");
            System.out.println("(1). Crear tablas ");
            System.out.println("(2). Ingresar datos ");
            System.out.println("(3). Consulta general ");
            System.out.println("(4). Consulta documento determinado ");
            System.out.println("(5). ActualizaciÃ³n cliente ");
            System.out.println("(6). Eliminar tablas ");
            System.out.println("(7). Salir ");
            System.out.println("----------------------------------------------------");
            System.out.println("----------------------------------------------------");
            opcion=UtilConsola.leerEntero("Inserta la opcion.- ", true);
			
		} catch (Exception e) {
			//TODO si el usuario introduce algo que no es un número, se controla la excepción
			System.err.println("Error debe digitar una de las opciones. ");
		}
		return opcion;
	}
}
