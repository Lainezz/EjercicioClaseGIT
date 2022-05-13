package notaria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;


public class InsertaDatosEnLaTabla {
    /**
     * Método para ingresar un nuevo cliente en la tabla clientes
     * Primero tiene que comprobar si ese cliente existe en la base de datos
     * utilizando {@link SeleccionaDatosDeTabla#consultarCodCliente(String)}.
     * En caso que el cliente no exista, procede a pedir los datos del cliente y a 
     * insertarlo en la base de datos.
     * 
     * El método hace lo siguiente:
     * 1º Le pide al usuario que inserte el código del cliente que quiere introducir
     * 2º La aplicación busca en la base de datos para comprobar que ese cliente no existe
     * 3º Si no existe, procede a pedirle los otros datos de la tabla (nombre y teléfono)
     * 
     * 4º Pide los datos de la tabla escrituras para introducirlos en dicha tabla
     * 5º Pide los datos de la tabla escCli para introducirlos en dicha tabla
     * 
     * @author Alba Parrilla
     */
	public void ingresarDatos() {
        String sql;
        ConexionMysql mysql = new ConexionMysql();
        Connection conn = null;
        Statement s;
        ResultSet rs;
        String codigoClienteRegistrado = "";
        try {
        	//Se realiza la conexión y siguientes pasos
            conn = mysql.Conectar();
            s = conn.createStatement();

            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese el codigo de cliente");
            String codigoCliente = scan.nextLine();

            SeleccionaDatosDeTabla seleccionaDatosDeTabla = new SeleccionaDatosDeTabla();
            if (seleccionaDatosDeTabla.consultarCodCliente(codigoCliente)) {
                System.out.println("--!!BIENVENIDO!!--");
                rs = s.executeQuery("SELECT cod_Cliente FROM clientes WHERE cod_Cliente = " + codigoCliente);
                rs.next();
                codigoClienteRegistrado = rs.getString(0);
            } else {
                System.out.println(":( Parece que no estas en nuestra base de datos, vamos a registrarte!");
                System.out.println(">Ingrese su codigo de cliente:");
                String codigo = scan.nextLine();
                System.out.println(">Ingrese su nombre:");
                String nombre = scan.nextLine();
                System.out.println(">Ingrese su telefono:");
                String telefono = scan.nextLine();
                s.executeUpdate(String.format(
                        "INSERT INTO clientes VALUES('%s', '%s','%s')",
                        codigo,
                        nombre,
                        telefono
                ));
                codigoClienteRegistrado = codigo;
                System.out.println("--Enhorabuena! Has sido registrado--");
            }
        	
        	//TODO se procede a pedir los datos para introducirlos en la BBDD
            System.out.println("Vamos a ingresar datos en la tabla ESCRITURAS :)\n");
            System.out.println(">Ingrese el codigo de escritura: ");
            String codigoEscritura = scan.nextLine();
            System.out.println(">Ingrese el tipo de escritura");
            String tipoEscritura = scan.nextLine();
            System.out.println(">Ingrese el nombre de la ficha");
            String nombreFicha = scan.nextLine();
            System.out.println(">Ingrese el numero de intervencion");
            int numeroIntervencion = -1;

            while (true) {
                try {
                    numeroIntervencion = scan.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("!!!!!INTRODUCE BIEN LOS PARAMETROS >:(!!!!!");
                }
            }

            s = conn.createStatement();
            s.executeUpdate(
                    String.format("INSERT INTO escrituras VALUES('%s','%s','%s','%s')",
                            codigoEscritura,
                            tipoEscritura,
                            nombreFicha,
                            numeroIntervencion
                    ));
            System.out.println("--DATOS INGRESADOS CORRECTAMENTE EN ESCRITURAS :)--");

            System.out.println("Ahora es hora de ingresar datos en la tabla ESCCLI :D\n");
            System.out.println(">Ingrese el codigo: ");
            String codigoEsccli = scan.nextLine();
            System.out.println(">Ingrese el codigo de escritura");
            int codnnEscritura = -1;
            s.executeUpdate(
                    String.format("INSERT INTO esccli VALUES('%s','%s','%s')",
                            codigoEsccli,
                            codigoClienteRegistrado,
                            codnnEscritura
                    ));

        	
        } catch(Exception e) { 
            System.err.println ("Se han encontrado errores... "); 
        } finally {    
            mysql.desconectar(conn);
        }
    }
}  
