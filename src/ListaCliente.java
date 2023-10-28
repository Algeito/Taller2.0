/**
 * Clase que representa la lista de clientes, con sus atributos cantidad cliente y cantidad maxima.
 */
public class ListaCliente {
    /**
     * Lista de clientes.
     */
    private Cliente[] listaCliente;
    /**
     * Cantidad actual del clientes
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
    public ListaCliente(int cantidadMaxima) {
        this.listaCliente = new Cliente[cantidadMaxima];
        this.cantidadCliente = 0;
        this.cantidadMaxima = cantidadMaxima;

    }

    public boolean inscribir(Cliente cliente){
        for (int i = 0; i< this.cantidadCliente; i++){
            Cliente clienteComprobar = this.listaCliente[i];
            if (clienteComprobar.getRut().equalsIgnoreCase(cliente.getRut())){
                return false;
            }
        }
        this.listaCliente[this.cantidadCliente] = cliente;
        this.cantidadCliente++;
        return true;
    }
}
