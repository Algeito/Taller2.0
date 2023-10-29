package model;

/**
 * Clase que representa un cliente a través de su Rut, nombre, apellido, fecha de nacimiento y tipo de licencia.
 */
public class Cliente {
    /**
     * Rut del cliente, compuesto de la forma XX.XXX.XXX-X.
     */
    private String rut;
    /**
     * Nombre del cliente.
     */
    private String nombre;
    /**
     * Apellido del cliente.
     */
    private String apellido;
    /**
     * Fecha de nacimiento del cliente.
     */
    private String fechaDeNacimiento;
    /**
     * Tipo de licencia del cliente, solo existe tipo de licencia B, C, A1, A2, A3.
     */
    private String tipoDeLicencia;

    /**
     * Constructor de la clase cliente.
     * @param rut Rut del cliente.
     * @param nombre Nombre del cliente.
     * @param apellido Apellido del cliente.
     * @param fechaDeNacimiento Fecha de naciemiento del cliente.
     * @param tipoDeLicencia Tipo de licencia del cliente.
     */
    public Cliente(String rut, String nombre, String apellido, String fechaDeNacimiento, String tipoDeLicencia) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.tipoDeLicencia = tipoDeLicencia;
    }
    /**
     * Metodo get del atributo Rut.
     * @return Rut del cliente.
     */
    public String getRut() {
        return rut;
    }
    /**
     * Metodo get del atributo nombre del cliente.
     * @return Nombre del cliente.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo get del atributo apellido del cliente.
     * @return Apellido del cliente.
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Metodo get del atributo fecha de nacimiento del cliente.
     * @return Fecha de nacimiento del cliente.
     */
    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    /**
     * Metodo get del atributo tipo de licencia del cliente.
     * @return Tipo de licencia del cliente.
     */
    public String getTipoDeLicencia() {
        return tipoDeLicencia;
    }
}
