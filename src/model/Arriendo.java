package model;

import collection.ListaCliente;
import collection.ListaVehiculo;

/**
 * Clase que representa un arriendo a través de el rut del cliente, la patente del auto, la fecha de inicio y termino.
 */
public class Arriendo {
    /**
     * Lista de vehiculos.
     */
    private ListaVehiculo listaVehiculo;
    /**
     * Lista de clientes.
     */
    private ListaCliente listaCliente;
    /**
     * Rut del cliente.
     */
    private String rutCLiente;
    /**
     * Patente del vehiculo que le pertenece al cliente.
     */

    private String patenteVehiculo;
    /**
     * Fecha de inicio para arrendar el vehiculo.
     */
    private String fechaDeIncio;
    /**
     * Fecha de termino para devolver el vehiculo.
     */

    private String fechaDeTermino;

    /**
     * Constructor de la clase arriendo.
     * @param rutCLiente Rut del cliente.
     * @param patenteVehiculo Patente del vehiculo.
     * @param fechaDeIncio Fecha de inicio del arriendo.
     * @param fechaDeTermino Fecha de termino del arriendo.
     */
    public Arriendo(String rutCLiente, String patenteVehiculo, String fechaDeIncio, String fechaDeTermino, int capacidadMaxima) {
        this.rutCLiente = rutCLiente;
        this.patenteVehiculo = patenteVehiculo;
        this.fechaDeIncio = fechaDeIncio;
        this.fechaDeTermino = fechaDeTermino;
        this.listaCliente = new ListaCliente(capacidadMaxima);
    }

    /**
     * Metodo get del atributo rut del cliente.
     * @return Rut del cliente en el arriendo.
     */
    public String getRutCLiente() {
        return rutCLiente;
    }

    /**
     * Metodo get del atributo patente del vehiculo.
     * @return Patente del vehiculo en el arriendo.
     */
    public String getPatenteVehiculo() {
        return patenteVehiculo;
    }

    /**
     * Metodo get del atributo fecha de inicio.
     * @return Fecha de inicio del arriendo.
     */
    public String getFechaDeIncio() {
        return fechaDeIncio;
    }

    /**
     * Metodo get del atributo fecha de termino.
     * @return Fecha de termino del arriendo.
     */
    public String getFechaDeTermino() {
        return fechaDeTermino;
    }

    /**
     * Metodo get del atributo lista cliente.
     * @return Lista cliente.
     */
    public ListaCliente getListaCliente(){
        return listaCliente;
    }

    /**
     * Metodo get del atributo lista vehiculo.
     * @return Lista vehiculo.
     */
    public ListaVehiculo getListaVehiculo(){
        return listaVehiculo;
    }
}


