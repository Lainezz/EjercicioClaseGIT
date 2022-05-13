package notaria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionMysql {

	/**
	 * Variables de la clase. Estas variables se refieren a los datos necesarios
	 * para poder realizar una conexi�n con la base de datos. Los datos son: nombre
	 * de la base de datos: notarbd url: es una base de datos mysql, utilizamos
	 * xampp usuario: el de por defecto de mysql pass: por defecto est� vac�a
	 * 
	 * @author Antonio
	 */
	// TODO definici�n de las variables de clase.

	final String url = "jdbc:mysql://localhost/";
	final String nombre = "notarbd";
	final String driver = "com.mysql.jdbc.Driver";
	final String usuario = "root";
	final String pass = "";

	/**
	 * M�todo para realizar una conexi�n con la base de datos. Los datos que vamos a
	 * utilizar para realizar esa conexi�n son las variables de clase de arriba
	 * 
	 * @return conn Objeto de tipo Connection
	 * @author Antonio
	 */
	public Connection Conectar() {

		Connection conn = null;

		try {
			// TODO cargamos el Driver

			Class.forName(driver);

			conn = DriverManager.getConnection(url + nombre, usuario, pass);

			// TODO establecemos la conexi�n

			if (conn != null) {
				System.out.println("[Conectado]\r\n");
			}

		} catch (ClassNotFoundException | SQLException e) {
			JOptionPane.showMessageDialog(null, e);
		}
		return conn;
	}

	/**
	 * Metodo que, en el caso de existir una conexion a una base de datos, realiza
	 * la desconexion de la misma.
	 * 
	 * @author Diego
	 */
	public void desconectar(Connection conn) {
		try {
			if(conn != null) {
				conn.close();
				System.out.println("[Desconectado]");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
