package notaria;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SeleccionaDatosDeTabla {
	/**
	 * M�todo que realiza una consulta a las tablas clientes, escrituras, y escCli.
	 * 
	 * Muestra todos los datos de las tablas anteriores con las siguientes condiciones:
	 * cod_Cliente de la tabla clientes es igual al codCli de la tabla escCli
	 * cod_escritura de la tabla escrituras es igual al codEsc de la tabla escCli
	 * 
	 * Muestra todos los resultados por consola.
	 * 
	 * @author Luis
	 */
	public void consultarDatos() {
		
		String query;
		ResultSet rs = null;
		Connection conn;
		Statement s;
		try {
			//TODO realizar conexion y ejecutar query
			

			System.out.println("\n**********************************");
			System.out.println("LOS DATOS DE LA TABLA CLIENTE SON:");
			System.out.println("**********************************");
			while (rs.next()) {
				// TODO mostrar los resultados de la consulta
			}

		} catch (Exception e) {
			System.err.println("Se han encontrado errores.- " + e.toString());
		} finally {
			//TODO cierra la conexion
		}
	}

	/**
	 * M�todo que realiza una consulta a las tablas clientes, escrituras, y escCli.
	 * 
	 * Muestra todos los datos de las tablas anteriores con las siguientes condiciones:
	 * cod_Cliente de la tabla clientes es igual al codCli de la tabla escCli
	 * cod_escritura de la tabla escrituras es igual al codEsc de la tabla escCli
	 * tipo de la tabla escrituras es igual al par�metro dato de tipo {@link String} que le viene dado por par�metros
	 * 
	 * Muestra todos los resultados por consola.
	 * 
	 * @author Jorge
	 */
	public void consultarDatos(String dato) {
		
		String query;
		ResultSet rs = null;
		Connection conn;
		Statement s;
		try {
			//TODO realizar conexion y ejecutar query
			

			System.out.println("\n**********************************");
			System.out.println("LOS DATOS DE LA TABLA CLIENTE SON:");
			System.out.println("**********************************");
			while (rs.next()) {
				// TODO mostrar los resultados de la consulta
			}

		} catch (Exception e) {
			System.err.println("Se han encontrado errores.- " + e.toString());
		} finally {
			//TODO cierra la conexion
		}
	}
	
	/**
	 * M�todo que realiza una consulta a las tablas clientes.
	 * 
	 * Realiza una consulta a la tabla clientes y devuelve true si existe el c�digo de cliente que se quiere consultar
	 * 
	 * @return true si el cliente existe en la tabla, false si el cliente no existe.
	 * @author Roberto
	 */
	public boolean consultarCodCliente(String codCliente) {
		
		boolean clienteExiste = false;
		
		ResultSet rs;
		Connection conn = null ;
		Statement s;
                ConexionMysql conexionmysql = new ConexionMysql();
		try {
			//TODO realizar conexion y ejecutar query
                      conn  = conexionmysql.Conectar();
                      s = conn.createStatement();
                      String query = ("SELECT * FROM clientes WHERE ID = "+codCliente);                     
                      clienteExiste=s.execute(query);
                      if(clienteExiste==true){
                          System.out.println("Cliente existente con el ID indicado");
                      }else{
                          System.out.println("No existe ningun cliente con el ID indicado");
                      }
			

		} catch (Exception e) {
			System.err.println("Se han encontrado errores.- " + e.toString());
		} finally {
			//TODO cierra la conexion
                        conexionmysql.desconectar(conn);
		}
		
		return clienteExiste;
	}
	
	/**
	 * M�todo que realiza una consulta a las tablas clientes.
	 * 
	 * Realiza una consulta a la tabla clientes y devuelve true si existe el nombre del cliente que se quiere consultar
	 * 
	 * @return true si el cliente existe en la tabla, false si el cliente no existe.
	 * @author Carlos
	 */
	public boolean consultarNomCliente(String NomCliente) {
		
		boolean clienteExiste = false;
		String query;
		ResultSet rs;
		Connection conn;
		Statement s;
		try {
			//TODO realizar conexion y ejecutar query
			

			

		} catch (Exception e) {
			System.err.println("Se han encontrado errores.- " + e.toString());
		} finally {
			//TODO cierra la conexion
		}
		
		return clienteExiste;
	}
}
