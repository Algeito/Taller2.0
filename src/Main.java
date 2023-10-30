import edu.princeton.cs.stdlib.StdOut;
import model.Cliente;
import service.SistemaImpl;
import service.Sistema;
import java.util.Scanner;

import static edu.princeton.cs.stdlib.StdOut.print;


public class Main {
    public static void main(String[] args) {
        Sistema sistema = new SistemaImpl(0, "", "");
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

        menu();

    }

    public static void imprimirMenu() {
        System.out.println("------Menu------");
        System.out.println("1. Ingresar Cliente");
        System.out.println("2. Ingresar Vehiculo");
        System.out.println("3. Registrar Arriendo");
        System.out.println("4. Gestionar Devolucion");
        System.out.println("5. Estadisticas");
        System.out.println("6. Salir y Guardar");
    }

    public static void menu(){

        Scanner s = new Scanner(System.in);
        imprimirMenu();
        String opcion = s.nextLine();

        while (!opcion.equals("6")){

            switch (opcion){
                case "1":
                    String ingresar = ingresar();
                    System.out.println();
                    break;
                case "2":
                    int ingresarVehiculo = ingresarVehiculo();
                    System.out.println();
                    break;
                case "3":
                    int RegistrarArriendo = RegistrarArriendo();
                    System.out.println();
                    break;
                case "4":
                    int GestionarDevolucion = GestionarDevolucion();
                    System.out.println();
                    break;
                case "5":
                    int estadisticas = estadisticas();
                    System.out.println();
                    break;
                return;
            }
            public static String ingresar() {
                System.out.println("Ingresar Rut: ");
                System.out.println("Ingresar Nombre: ");
                System.out.println("Ingresar Apellido: ");

                return;
            }

            public static boolean ingresarVehiculo(){
                System.out.println("Ingresar Rut: ");
                System.out.println("Ingresar Nombre: ");
                System.out.println("Ingresar Apellido: ");

                return ;
            }
            public static boolean RegistrarArriendo(){
                System.out.println("Ingresar Rut: ");
                System.out.println("Ingresar Nombre: ");
                System.out.println("Ingresar Apellido: ");

                return;
            }

            public static boolean GestionarDevolucion(){
                System.out.println();

                return;
            }
            public static boolean estadisticas(){
                System.out.println();

                return;
            }
            imprimirMenu();
            opcion = s.nextLine();
        }

    }




}
}