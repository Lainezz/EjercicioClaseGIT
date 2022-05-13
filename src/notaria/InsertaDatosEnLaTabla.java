package notaria;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;



public class InsertaDatosEnLaTabla { 
    /**
     * M�todo para ingresar un nuevo cliente en la tabla clientes
     * Primero tiene que comprobar si ese cliente existe en la base de datos
     * utilizando {@link SeleccionaDatosDeTabla#consultarCodCliente(String)}.
     * En caso que el cliente no exista, procede a pedir los datos del cliente y a 
     * insertarlo en la base de datos.
     * 
     * El m�todo hace lo siguiente:
     * 1� Le pide al usuario que inserte el c�digo del cliente que quiere introducir
     * 2� La aplicaci�n busca en la base de datos para comprobar que ese cliente no existe
     * 3� Si no existe, procede a pedirle los otros datos de la tabla (nombre y tel�fono)
     * 
     * 4� Pide los datos de la tabla escrituras para introducirlos en dicha tabla
     * 5� Pide los datos de la tabla escCli para introducirlos en dicha tabla
     * 
     * @author Alba Parrilla
     */
	public void ingresarDatos(){
        String sql;
        ConexionMysql mysql = new ConexionMysql();
        Connection conn;
        Statement s;
        ResultSet rs;
        try {
            
        	//Se realiza la conexi�n y siguientes pasos
        	
        	//TODO se pide el codCli y se busca en la tabla de la BBDD
        	
        	//TODO se procede a pedir los datos para introducirlos en la BBDD
        	
        	
        } catch(Exception e) { 
            System.err.println ("Se han encontrado errores... "); 
        } finally {    
            //TODO realizar desconexi�n BBDD
        }
    }
}  
