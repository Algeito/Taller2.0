package service;

import edu.princeton.cs.stdlib.StdOut;
import model.Cliente;

import static service.SistemaImpl.inscribir;

public interface Sistema {



    /**
     * Realiza la carga de un archivo de texto relacionado con todos los clientes
     * @param nombreArchivo Nombre del archivo de texto que contiene todos los clientes
     * @return True si el archivo fue cargado exitosamente, false en caso contrario
     */
    boolean cargarArchivoCliente(String nombreArchivo);

    /**
     *Realiza la inscripcion de un nuevo cliente.
     * @param rut Rut del cliente.
     * @param nombre Nombre del cliente.
     * @param apellido Apellido del cliente.
     * @param fechaDeNacimiento Fecha de nacimiento del cliente.
     * @param tipoDeLicencia Tipo de licencia del cliente.
     * @return True si se logra inscribir
     */
    boolean inscribir(String rut, String nombre, String apellido, String fechaDeNacimiento, String tipoDeLicencia);

    /**
     * bla bla bla
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


    boolean registrarArriendo(String patenteDeVehiculo, String rutCliente, int cantidadDiasArrendado);

    String[] devolucionDeVehiculo(String rutCliente);

    String[] desplegarEstadisticas();
    void guardarArchivo();


}
