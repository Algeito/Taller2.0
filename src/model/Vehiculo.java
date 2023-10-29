package model;

/**
 * Clase que represeta un vehiculo a través de su patente, numero de ruedas, tipo de vehiculo, numero de asientos y estado.
 */
public class Vehiculo {
    /**
     * Patente del vehiculo, compuesto por XXXX-NN.
     */
    private String patente;
    /**
     * El numero de ruedas del vehiculo.
     */
    private int numerosDeRuedas;
    /**
     * Tipo de vehiculo, auto particular, ambulancia, taxi, entre otros.
     */
    private String tipoDeVehiculo;
    /**
     * El numero de asientos del vehiculo.
     */
    private int numeroDeAsiento;
    /**
     * El estado del vehiculo, si es nuevo o usado.
     */
    private String estado;

    /**
     * Constructor de la clase vehiculo.
     * @param patente Patente del vehiculo.
     * @param numerosDeRuedas Numero de ruedas del vehiculo.
     * @param tipoDeVehiculo Tipo de model.Vehiculo.
     * @param numeroDeAsiento Numero de asientos del vehiculo.
     * @param estado Estado del vehiculo.
     */
    public Vehiculo(String patente, int numerosDeRuedas, String tipoDeVehiculo, int numeroDeAsiento, String estado) {
        this.patente = patente;
        this.numerosDeRuedas = numerosDeRuedas;
        this.tipoDeVehiculo = tipoDeVehiculo;
        this.numeroDeAsiento = numeroDeAsiento;
        this.estado = estado;
    }

    /**
     * Metodo get del atributo patente.
     * @return Patente del vehiculo.
     */
    public String getPatente() {
        return patente;
    }

    /**
     * Metodo get del atributo numero de ruedas.
     * @return Numero de ruedas del vehiculo.
     */
    public int getNumerosDeRuedas() {
        return numerosDeRuedas;
    }

    /**
     * Metodo get del atributo tipo de vehiculo.
     * @return Tipo de vehiculo.
     */
    public String getTipoDeVehiculo() {
        return tipoDeVehiculo;
    }

    /**
     * Metodo get del atributo numero de asientos.
     * @return Numero de asientos del vehiculo.
     */
    public int getNumeroDeAsiento() {
        return numeroDeAsiento;
    }

    /**
     * Metodo get del atributo estado.
     * @return Estado del vehiculo.
     */
    public String getEstado() {
        return estado;
    }
}

