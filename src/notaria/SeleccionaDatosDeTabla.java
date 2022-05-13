package notaria;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SeleccionaDatosDeTabla {
	/**
	 * Método que realiza una consulta a las tablas clientes, escrituras, y escCli.
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
		
		String query = "SELECT * FROM clientes, escrituras, escCli";
		ConexionMysql mysql;
		ResultSet rs;
		Connection conn;
		Statement s;
		try {
			//TODO realizar conexion y ejecutar query
			
			//Realizamos la conexión con la bbdd
			mysql = new ConexionMysql();
			conn = mysql.Conectar();
			
			//Preparo Statement
			s = conn.createStatement();

			//ejecuto la query
			rs = s.executeQuery(query);

			//Manejo los datos
			System.out.println("\n**********************************");
			System.out.println("LOS DATOS DE LA TABLA CLIENTE SON:");
			System.out.println("**********************************");
			while (rs.next()) {
				// TODO mostrar los resultados de la consulta
				System.out.println(rs.getInt(1));
				
				if (rs.getString("cod_ciudad").equals(rs.getString("codCli"))
					&& rs.getString("cod_escritura").equals(rs.getString("codEsc"))) {
					System.out.println(rs.getString("cod_ciudad"));
					System.out.println(rs.getString("cod_escritura"));
				}
			}
		} catch (Exception e) {
			System.err.println("Se han encontrado errores.- " + e.toString());
		} finally {
			//TODO cierra la conexion
		}
	}

	/**
	 * Método que realiza una consulta a las tablas clientes, escrituras, y escCli.
	 * 
	 * Muestra todos los datos de las tablas anteriores con las siguientes condiciones:
	 * cod_Cliente de la tabla clientes es igual al codCli de la tabla escCli
	 * cod_escritura de la tabla escrituras es igual al codEsc de la tabla escCli
	 * tipo de la tabla escrituras es igual al parámetro dato de tipo {@link String} que le viene dado por parámetros
	 * 
	 * Muestra todos los resultados por consola.
	 * 
	 * @author Antonio Caparrós
	 */
	public void consultarDatos(String dato) {
		
		String query;
		ResultSet rs;
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
	 * Método que realiza una consulta a las tablas clientes.
	 * 
	 * Realiza una consulta a la tabla clientes y devuelve true si existe el código de cliente que se quiere consultar
	 * 
	 * @return true si el cliente existe en la tabla, false si el cliente no existe.
	 * @author Roberto
	 */
	public boolean consultarCodCliente(String codCliente) {
		
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
	
	/**
	 * Método que realiza una consulta a las tablas clientes.
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
