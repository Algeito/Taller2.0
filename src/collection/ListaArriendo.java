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
     * Cantidad de dias arriendo.
     */
    private int cantidadDiasArriendo;

    /**
     * Constructor de la clase lista arriendos.
     * @param cantidadMaxima Cantidad maxima de arriendos
     */
    public ListaArriendo(int cantidadMaxima){
        this.listaArriendo = new Arriendo[cantidadMaxima];
        this.cantidadArriendo = 0;
        this.cantidadMaxima = cantidadMaxima;

    }
    public boolean desplegar(int cantidadArriendo){
        System.out.println(getCantidadArriendo());
        return true;
    }

    /**
     * Isncribir un arriendo a la lista arriendo.
     * @param arriendo Arriendo a inscribir.
     * @return True si hay espacio en la lista y la patente no existe previamente, false en el caso contrario.
     */
    public boolean agregar(Arriendo arriendo){
        //Comprobar si la lista arriendo esta llena.
        if (this.cantidadArriendo == this.cantidadMaxima){
            return false;
        }
        //Comprobar si el arriendo existe previamente a través de su patente.
        for (int i = 0; i< this.cantidadArriendo; i++){
            Arriendo arriendoComprobar = this.listaArriendo[i];
            if (arriendoComprobar.getPatenteVehiculo().equalsIgnoreCase(arriendo.getPatenteVehiculo())){
                return false;
            }
        }
        //Agregar el arriendo a la lista arriendo.
        this.listaArriendo[this.cantidadArriendo] = arriendo;
        this.cantidadArriendo++;
        return true;
    }

    /**
     * Buscar el arriendo segun la patente.
     * @param patenteVehiculo Patente del vehiculo que esta ligado.
     * @return Si la pantente existe en la lista de arriendos, retorna el arriendo, en caso contrario retorna null.
     */
    public Arriendo buscar(String patenteVehiculo){
        //Busca el arriendo a través de la patente del vehiculo patente.
        for (int i = 0; i< this.cantidadArriendo; i++){
            Arriendo arriendo = this.listaArriendo[i];
            if (arriendo.getPatenteVehiculo().equalsIgnoreCase(patenteVehiculo)){
                return arriendo;
            }
        }
        return null;
    }

    /**
     * Eliminar rut del cliente en la lista arriendo.
     * @param rutCliente Rut del cliente.
     * @return Si el rut del cliente existe en la lista Arriendo, retorna el arriendo eliminado, en caso contrario retorna false.
     */
    public boolean eliminar(String rutCliente){
        int i;
        boolean existe = false;

        for (i = 0; i<this.cantidadArriendo; i++){
            Arriendo arriendo = this.listaArriendo[i];
            if (arriendo.getRutCLiente().equalsIgnoreCase(rutCliente)){
                existe = true;
                break;
            }
        }
        if(!existe){
            return false;
        }

        for (int j = i; j< this.cantidadArriendo- 1; j++){
            this.listaArriendo[j] = this.listaArriendo[j + 1];

        }
        this.cantidadArriendo--;
        this.listaArriendo[this.cantidadArriendo] = null;
        return true;
    }

    /**
     * Obtener el arriendo a través de su posicion en la lista arriendo.
     * @param posicion Posicion del arriendo a obtener.
     * @return Si la posicion del vehiculo esta dentro de los parametros retornara null, en caso contrario retorna la posicion en la lista vehiculo.
     */
    public Arriendo obtener(int posicion){
        if(posicion < 0 || this.cantidadArriendo <= posicion){
            return null;
        }
        return this.listaArriendo[posicion];
    }

    public int getCantidadArriendo() {
        return cantidadArriendo;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public int getCantidadDiasArriendo() {
        return cantidadDiasArriendo;
    }
}