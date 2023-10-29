package service;


import collection. ListaArriendo;
import collection. ListaCliente;
import collection. ListaVehiculo;
import edu.princeton.cs.stdlib.In;
import model.Cliente;

public class SistemaImpl implements Sistema {

    private ListaArriendo listaArriendo;

    private ListaVehiculo listaVehiculo;

    private ListaCliente listaCliente;

    public SistemaImpl(int cantidadDiasArrendado, String patenteDeVehiculo, String rutCliente){

        this.listaArriendo = new ListaArriendo(cantidadDiasArrendado);
        this.listaCliente = new ListaCliente(5);
        this.listaVehiculo = new ListaVehiculo(6);
    }

    /**
     * Realiza la carga de un archivo de texto relacionado con todos los administradores
     *
     * @param nombreArchivo ...
     * @return....
     */

    //todo repetir esta linea de codigo con los demas cargar archivos RECORDAR!!!
    @Override
    public boolean cargarArchivoCliente(String nombreArchivo) {
        In archivo = new In(nombreArchivo);
        while (archivo.hasNextLine()) {
            String linea = archivo.readLine();
            String[] campos = linea.split(",");
            String rut = campos[0];
            String nombre = campos[1];
            String apellido = campos[2];
            String fechaDeNacimiento = campos[3];
            String tipoDeLicencia = campos[4];


            Cliente cliente = new Cliente(rut, nombre, apellido, fechaDeNacimiento, tipoDeLicencia);
            boolean inscribir = this.listaCliente.inscribir(cliente);

            if (inscribir) {
                System.out.println("El nombre de cliente " + cliente + " ha sido inscrito correctamente.");
            }else {
                System.out.println("el nombre"+ cliente+ " ya esta inscrito");
            }


        }
        archivo.close();

        return true;

    }

    /**
     * bla bla bla
     *
     * @param rut
     * @param nombre
     * @param apellido
     * @param fechaDeNacimiento
     * @return ..
     */
    @Override
    public boolean inscribirCliente(String rut, String nombre, String apellido, String fechaDeNacimiento) {
        return false;
    }

    /**
     * blla bla bla
     *
     * @param nombreArchivo
     */
    @Override
    public boolean cargarArchivoVehiculo(String nombreArchivo) {
        return false;
    }

    /**
     * @param patente
     * @param numeroDeRuedas
     * @param numeroDeAsientos
     * @param tipoDeVehiculo
     * @param estado
     * @return
     */
    @Override
    public boolean inscribirVehiculo(String patente, int numeroDeRuedas, int numeroDeAsientos, String tipoDeVehiculo, String estado) {
        return false;
    }

    /**
     * @param nombreArchivo
     * @return
     */
    @Override
    public boolean cargarArchivoDeArriendo(String nombreArchivo) {
        return false;
    }

    /**
     * @return
     */
    @Override
    public boolean registrarArriendo() {
        return false;
    }

    /**
     * @return
     */
    @Override
    public boolean devolucionDeVehiculo() {
        return false;
    }

    /**
     * @return
     */
    @Override
    public boolean desplegarEstadisticas() {
        return false;
    }

    /**
     *
     */
    @Override
    public void guardarArchivo() {
        return false;
    }
}
