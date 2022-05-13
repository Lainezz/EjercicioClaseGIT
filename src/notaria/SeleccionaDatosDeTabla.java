package notaria;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import gestion.ConexionMySQL;

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
		
		Scanner scan = new Scanner(System.in);
		ConexionMysql conexion = new ConexionMysql();
		String query;
		Connection conn = conexion.Conectar();
		try {
			
			Statement s = conn.createStatement();
			
			query = "SELECT c.cod_Cliente, c.nombre, c.telefono, e.cod_Escritura, e.tipo, e.nom_fich, e.num_interv, ec.codigo FROM clientes AS c\r\n"
					+ "JOIN escrituras AS e ON c.cod_Cliente = ec.codCli\r\n"
					+ "JOIN escCli AS ec ON e.cod_Escritura = ec.codEsc\r\n"
					+ "WHERE e.tipo = '"+dato+"';";
			
			ResultSet rs = s.executeQuery(query); 
			
			System.out.println("\n**********************************");
			System.out.println("LOS DATOS DE LA TABLA CLIENTE SON:");
			System.out.println("**********************************");
			while (rs.next()) {
				System.out.println(rs.getString(1)+", "+rs.getString(2)+", "+rs.getString(3)+", "+rs.getString(4)+", "+rs.getString(5)+", "+rs.getString(6)+", "+rs.getString(7)+", "+rs.getString(8));
				}  
		} catch (Exception e) {
			System.err.println("Se han encontrado errores.- " + e.toString());
		} finally {
			conexion.desconectar(conn);
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
