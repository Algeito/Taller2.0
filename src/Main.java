import edu.princeton.cs.stdlib.StdOut;
import service.SistemaImpl;
import service.Sistema;

import static edu.princeton.cs.stdlib.StdOut.print;


public class Main {
    public static void main(String[] args) {
        Sistema sistema = new SistemaImpl(1000, 1000, 1000);
        boolean cargaArchivo = sistema.cargarArchivoDeArriendo("Arriendo.txt");

        if (!cargaArchivo) {
            print("Error en la carga del archivo administradores.txt.");
        }

        cargaArchivo = sistema.cargarArchivoCliente("Clientes.txt");

        if (!cargaArchivo) {
            print("Error en la cargar el archivo Clietes");
        }

        cargaArchivo = sistema.cargarArchivoVehiculo("Vehiculos.txt");

        if (!cargaArchivo) {
            print("Error en cargar el archivo Vehiculos");
        }

        menuPrincipal(sistema);
    }
        //todo crear el sistema Arriendo donde se deven desplegar lo indicado, para busqueda de clientes con el rut se hace una comparacion recorriendo la lista cliente para ver si coincide el rut con lo que estan agregados,
        //todo, crear un archivo txt donde guarde los datos en forma de estadisticas y uno donde guarde el la lista de arriendo
    public static void menuPrincipal(Sistema sistema) {
        boolean salirMenuPrincipal = false;
        int opcion;
        String respuestaDelSistema = "";

        while (!salirMenuPrincipal) {
            StdOut.println(":::Menu Principal:::");
            StdOut.println("[1] Ingresar Cliente");
            StdOut.println("[2] ingresar Vehiculo");
            StdOut.println("[3] Registrar Arriendo");
            StdOut.println("[4] Gestionar Devolucion");
            StdOut.println("[5] Estadisticas");
            StdOut.println("[6] Salir y Guardar");

            opcion = ("Ingrese una opcion entre 1 y 6", true, 1, 6);

            if (opcion == 1) {
                respuestaDelSistema = sistema.inscribir();

            } else if (opcion == 2) {
                respuestaDelSistema = sistema.inscribirVehiculo();

            } else if (opcion == 3) {
                respuestaDelSistema = sistema.registrarArriendo();

            } else if (opcion == 4) {
                respuestaDelSistema = sistema. ();

            } else if (opcion == 5) {
                respuestaDelSistema = sistema.desplegarTodasLasDestrezas();

            } else if (opcion == 6) {
                salirMenuPrincipal = true;
                respuestaDelSistema = "Hasta Luego!";
            }

            StdOut.println(respuestaDelSistema);
        }
    }
}