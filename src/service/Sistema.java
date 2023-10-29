package service;

import edu.princeton.cs.stdlib.StdOut;

public interface Sistema {

    //todo crear el sistema Arriendo donde se deven desplegar lo indicado, para busqueda de clientes con el rut se hace una comparacion recorriendo la lista cliente para ver si coincide el rut con lo que estan agregados,
    //todo, crear un archivo txt donde guarde los datos en forma de estadisticas y uno donde guarde el la lista de arriendo
    public static void menuPrincipal(Sistema sistema){
        boolean salirMenuPrincipal = false;
        int opcion;
        String respuestaDelSistema = "";

        while (!salirMenuPrincipal){
            StdOut.println(":::Menu Principal:::");
            StdOut.println("[1] Ingresar Cliente");
            StdOut.println("[2] ingresar Vehiculo");
            StdOut.println("[3] Registrar Arriendo");
            StdOut.println("[4] Gestionar Devolucion");
            StdOut.println("[5] Estadisticas");
            StdOut.println("[6] Salir y Guardar");

            opcion = leerEntero("Ingrese una opcion entre 1 y 6",true,1,6);

            if (opcion == 1) {
                respuestaDelSistema = sistemaDeArriendo.desplegarTodasLasCartas();

            } else if (opcion == 2) {
                respuestaDelSistema = sistemaDeArriendo.desplegarTodasLasEntidades();

            } else if (opcion == 3) {
                respuestaDelSistema = sistemaDeArriendo.desplegarTodasLasDestrezas();

            } else if (opcion == 4) {
                respuestaDelSistema = sistemaDeArriendo.desplegarTodasLasDestrezas();

            } else if (opcion == 5) {
                respuestaDelSistema = sistemaDeArriendo.desplegarTodasLasDestrezas();

            } else if (opcion == 6) {
                salirMenuPrincipal = true;
                respuestaDelSistema = "Hasta Luego!";
            }

            StdOut.println(respuestaDelSistema);


    /**
     * Realiza la carga de un archivo de texto relacionado con todos los administradores
     * @param nombreArchivo ...
     * @return....
     */
    boolean cargarArchivoCliente(String nombreArchivo);

    /**
     * bla bla bla
     * @param rut,
     * @param nombre,
     * @param apellido,
     * @param fechaDeNacimiento, bla bla  bla
     * @return ..
     */

    boolean inscribirCliente(String rut, String nombre, String apellido, String fechaDeNacimiento);

    /**
     * blla bla bla
     * @param nombreArchivo
     */

    boolean cargarArchivoVehiculo(String nombreArchivo);

    /**
     *
     *
     * @param patente
     * @param numeroDeRuedas
     * @param numeroDeAsientos
     * @param tipoDeVehiculo
     * @param estado
     * @return
     */
    boolean inscribirVehiculo(String patente, int numeroDeRuedas, int numeroDeAsientos, String tipoDeVehiculo, String estado);

    /**
     *
     * @param nombreArchivo
     * @return
     */
    boolean cargarArchivoDeArriendo(String nombreArchivo);


    boolean registrarArriendo();
    boolean devolucionDeVehiculo();
    boolean desplegarEstadisticas();
    void guardarArchivo();


}
