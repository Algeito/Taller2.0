package collection;

import model.Vehiculo;

/**
 * Lista que representa la cantidad de vehiculos, con los atributos cantidad de vehiculos y cantidad maxima de vehiculos.
 */
public class ListaVehiculo {
    /**
     * listado de vehiculos
     */
    private Vehiculo[] listaVehiculo;
    /**
     * Cantidad actual de vehiculos en la lista vehiculos.
     */
    private int cantidadVehiculo;
    /**
     * Cantidad Maxima de vehiculos en la lista vehiculos.
     */
    private int cantidadMaxima;

    /**
     * Constructor de la clase lista vehiculos.
     * @param cantidadMaxima Cantidad maxima de vehiculos.
     */
    public ListaVehiculo(int cantidadMaxima){
        this.listaVehiculo = new Vehiculo[cantidadMaxima];
        this.cantidadVehiculo = 0;
        this.cantidadMaxima = cantidadMaxima;

    }

    /**
     * Inscribe un vehiculo a la lista vehiculos.
     * @param vehiculo model.Vehiculo a inscribir.
     * @return True si hay espacio en la lista y la patente no existe previamente, false en el caso contrario.
     */
    public boolean inscribir(Vehiculo vehiculo){
        //Comprobar si la lista vehiculo esta llena.
        if (this.cantidadVehiculo == this.cantidadMaxima){
            return false;
        }
        //Comprobar si el vehiculo existe previamente a través de su patente.
        for (int i = 0; i< this.cantidadVehiculo; i++){
            Vehiculo vehiculoComprobar = this.listaVehiculo[i];
            if (vehiculoComprobar.getPatente().equalsIgnoreCase(vehiculo.getPatente())){
                return false;
            }
        }
        //Inscribir al cliente a la lista cliente.
        this.listaVehiculo[this.cantidadVehiculo] = vehiculo;
        this.cantidadVehiculo++;
        return true;
    }
    /**
     * Busca el vehiculo a través de su patente en la lista vehiculo.
     * @param patente patente del vehiculo a buscar.
     * @return Si la pantente existe en la lista de vehiculos, retorna el vehiculo, en caso contrario retorna null.
     */
    public Vehiculo buscar(String patente){
        //Busca el vehiculo a través de su patente.
        for (int i = 0; i< this.cantidadVehiculo; i++){
            Vehiculo vehiculo = this.listaVehiculo[i];
            if (vehiculo.getPatente().equalsIgnoreCase(patente)){
                return vehiculo;
            }
        }
        return null;
    }

    /**
     * Eliminar el vehiculo a través de su patente en la lista vehiculo.
     * @param patente Patente del vehiculo a eliminar.
     * @return Si la patente existe en la lista vehiculos, retorna el vehiculo eliminado, en caso contrario retorna false.
     */
    public boolean eliminar(String patente){
        int i;
        boolean existe = false;

        for (i = 0; i<this.cantidadVehiculo; i++){
            Vehiculo vehiculo = this.listaVehiculo[i];
            if (vehiculo.getPatente().equalsIgnoreCase(patente)){
                existe = true;
                break;
            }
        }
        if(!existe){
            return false;
        }

        for (int j = i; j< this.cantidadVehiculo- 1; j++){
            this.listaVehiculo[j] = this.listaVehiculo[j + 1];

        }
        this.cantidadVehiculo--;
        this.listaVehiculo[this.cantidadVehiculo] = null;
        return true;
    }

    /**
     * Obtener el vehiculo a travé de su posicion en la lista vehiculos.
     * @param posicion Posicion del vehiculo a obtener.
     * @return Si la posicion del vehiculo esta dentro de los parametros retornara null, en caso contrario retorna la posicion en la lista vehiculo.
     */
    public Vehiculo obtener(int posicion){
        if(posicion < 0 || this.cantidadVehiculo <= posicion){
            return null;
        }
        return this.listaVehiculo[posicion];
    }
}