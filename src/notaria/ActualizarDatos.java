package notaria;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ActualizarDatos { 
    /**
     * M�todo que actualiza los datos de un cliente de la tabla clientes dado el nombre del cliente.
     * 
     * El m�todo hace lo siguiente:
     * 1� Consulta si el nombre del cliente existe en la base de datos
     * 2� Muestra por pantalla los datos del cliente seleccionado
     * 3� Si existe tal cliente, le pide al usuario que inserte un nuevo nombre y un nuevo tel�fono
     * 4� Realiza la Query para updatear ese registro con los nuevos datos
     * 
     * @param nomCli Nombre del cliente que viene dado por par�metros
     * @author Fran
     */
	public void actualizarClientes(String nomCli) {
		
		String query;
		
        ConexionMysql mysql = new ConexionMysql();
        Connection conn;
        Statement s;
        ResultSet rs;
        
        try{
            
        } catch(Exception e) { 
            System.err.println ("Se han encontrado errores.- "+e.toString());     
        } finally {    
            //TODO realiza la desconexi�n de la base de datos.
        }
    }}