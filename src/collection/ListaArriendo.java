package collection;

import model.Arriendo;

/**
 * Clase que representa la lista de arriendos con los atributos cantidad de arriendos y cantidad maxima de arriendos.
 */
public class ListaArriendo {
    /**
     * Lista de arriendos.
     */
    private Arriendo[] listaArriendo;
    /**
     * Cantidad actual de arriendos.
     */
    private int cantidadArriendo;
    /**
     * Cantidad maxima de arriendos.
     */
    private int cantidadMaxima;

    /**
     * Constructor de la clase lista arriendos.
     * @param cantidadMaxima Cantidad maxima de arriendos
     */
    public ListaArriendo(int cantidadMaxima){
        this.listaArriendo = new Arriendo[cantidadMaxima];
        this.cantidadArriendo = 0;
        this.cantidadMaxima = cantidadMaxima;

    }


}