package notaria;
import java.sql.Connection;
import java.sql.Statement;

/**  
 * nombre Ejercicio 1 de tarea 11 
 * descripción: clase que permite eliminar las tablas con todos sus datos.
 * @author Angel León
 */

public class EliminaTabla { 
    
	/**
	 * M�todo que borra las tres tablas de la base de datos notarbd.
	 * Las tablas a eliminar son escCli, clientes y escrituras
	 * 
	 * @author Joseph
	 */
    public void borrar () { 
        ConexionMysql mysql = new ConexionMysql();
        Connection conn;
        Statement s;
        try {
            //TODO establecer conexion a la base de datos y preparar las sentencias
        	
            //TODO sentencias para elminar las tablas de la base de datos

            
        	//Mensaje de confirmaci�n de que las tablas han sido eliminadas
        	System.out.println ("\n *** Tablas eliminadas ***"); 
        }catch (Exception e) { 
            System.err.println ("Error al intentar borrar las tablas. "); 
        } finally {
            //TODO realizar la desconexi�n de la base de datos
        }
    } 
} 


