package collection;

import model.Cliente;

/**
 * Clase que representa la lista de clientes, con sus atributos cantidad cliente y cantidad maxima.
 */
public class ListaCliente {
    /**
     * Lista de clientes.
     */
    private Cliente[] listaCliente;
    /**
     * Cantidad actual de clientes en la lista clientes.
     */
    private int cantidadCliente;
    /**
     * Cantidad Maxima de clientes en la lisat cliente
     */
    private int cantidadMaxima;

    /**
     * Constructor de la clase lista cliente.
     * @param cantidadMaxima Cantidad Maxima de clientes
     */
    public ListaCliente(String cantidadMaxima) {
        this.listaCliente = new Cliente[cantidadMaxima];
        this.cantidadCliente = 0;
        this.cantidadMaxima = cantidadMaxima;

    }

    /**
     * Inscribe un cliente a la lista de clientes.
     * @param cliente model.Cliente a inscribir
     * @return True si hay espacio en la lista y el Rut del cliente no existe previamente, false en el caso contrario.
     */
    public boolean inscribir(Cliente cliente){
        //Comprobar si la lista cliente esta llena.
        if (this.cantidadCliente == this.cantidadMaxima){
            return false;
        }
        //Comprobar si el cliente existe previamente a través de su Rut.
        for (int i = 0; i< this.cantidadCliente; i++){
            Cliente clienteComprobar = this.listaCliente[i];
            if (clienteComprobar.getRut().equalsIgnoreCase(cliente.getRut())){
                return false;
            }
        }
        //Inscribir al cliente a la lista cliente.
        this.listaCliente[this.cantidadCliente] = cliente;
        this.cantidadCliente++;
        return true;
    }

    /**
     * Busca el cliente a través de su Rut en la lista cliente.
     * @param rut Rut del cliente a buscar.
     * @return Si el Rut existe en la lista de clientes, retorna el cliente, en caso contrario retorna null.
     */
    public Cliente buscar(String rut){
        //Busca el cliente a través de su Rut.
        for (int i = 0; i< this.cantidadCliente; i++){
            Cliente cliente = this.listaCliente[i];
            if (cliente.getRut().equalsIgnoreCase(rut)){
                return cliente;
            }
        }
        return null;

    }
    /**
     * Eliminar el cliente a través de su Rut en la lista cliente.
     * @param rut Rut del cliente a eliminar.
     * @return Si el Rut existe en la lista clientes, retorna el cliente eliminado, en caso contrario retorna false.
     */
    public boolean eliminar(String rut){
        int i;
        boolean existe = false;

        for (i = 0; i<this.cantidadCliente; i++){
            Cliente cliente = this.listaCliente[i];
            if (cliente.getRut().equalsIgnoreCase(rut)){
                existe = true;
                break;
            }
        }
        if(!existe){
            return false;
        }

        for (int j = i; j< this.cantidadCliente- 1; j++){
            this.listaCliente[j] = this.listaCliente[j + 1];

        }
        this.cantidadCliente--;
        this.listaCliente[this.cantidadCliente] = null;
        return true;
    }

    /**
     * Obtener el cliente a través de la posicion en la lista cliente.
     * @param posicion Posicion del cliente a obtener.
     * @return Si la posicion del cliente esta dentro de los parametros, retorna null, en caso contrario retorna la posicion en la lista cliente.
     */
    public Cliente obtener(int posicion){
        if(posicion < 0 || this.cantidadCliente <= posicion){
            return null;
        }
        return this.listaCliente[posicion];
    }

    /**
     * Metodo get del atributo cantidad cliente del listado cliente.
     * @return Cantidad actual de clientes.
     */
    public int getCantidadCliente() {
        return cantidadCliente;
    }

    /**
     * Metodo get del atributo cantidad maxima del listado cliente.
     * @return Cantidad maxima.
     */
    public int getCantidadMaxima() {
        return cantidadMaxima;
    }
}
