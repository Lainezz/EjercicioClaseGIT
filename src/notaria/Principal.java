
package notaria;


/**
 * Clase principal de la aplicaci�n
 * Contiene m�todo main
 */
public class Principal {
    public static void main(String[] args) {
        //men obtiene el valor de la opcion seleccionada
        MenuOpciones men= new MenuOpciones();
        CreaTabla ct=new CreaTabla();
        EliminaTabla et = new EliminaTabla();
        InsertaDatosEnLaTabla agregar=new InsertaDatosEnLaTabla();
        SeleccionaDatosDeTabla seleccion=new SeleccionaDatosDeTabla();
        ActualizarDatos modificar=new ActualizarDatos();
        String txt_tipo, txt_nom, txt="n";
        int flag=0;
        int opcion;
        while (flag==0){
            opcion=men.menuPrincipal();
            switch (opcion){
                case 1: //accede al metodo que permite crear las tablas vacias
                    ct.crear();
                    break;
                case 2: //accede al metodo que permite insertar los datos en la base de datos
                    agregar.ingresarDatos();
                    break;
                case 3: //accede al metodo permite consultar los datos de las tablas
                    seleccion.consultarDatos();
                    break;
                case 4: //accede al metodo permite consultar clientes con determinados tipos de doc.
                    txt_tipo=UtilConsola.leerCadena("Dime tipo de documento a buscar (ESC, CV).- ", true);
                    seleccion.consultarDatos(txt_tipo);
                    break;
                case 5: //accede al metodo que permite modificar datos de la tabla clientes
                    txt_nom=UtilConsola.leerCadena("Dime nombre de cliente a modificar.- ", true);
                    modificar.actualizarClientes(txt_nom);
                    break;
                case 6: //accede al metodo que permite eliminar las tablas creadas
                    txt=UtilConsola.leerCadena("Est� seguro, se borrar� todo (S/n)? ", true);
                    if (txt.equals("S"))
                        et.borrar();
                    break;
                case 7: //bandera variable que termina el ciclo de opciones
                    flag=1;
                    break;
            } 
        } 
    }
}

        
       