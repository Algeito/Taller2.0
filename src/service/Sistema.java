package service;

public interface Sistema {
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
