package service;


import collection. ListaArriendo;
import collection. ListaCliente;
import collection. ListaVehiculo;
import edu.princeton.cs.stdlib.In;
import model.Arriendo;
import model.Cliente;
import model.Vehiculo;

public class SistemaImpl implements Sistema {

    private ListaArriendo listaArriendo;

    private ListaVehiculo listaVehiculo;

    private ListaCliente listaCliente;

    public SistemaImpl(int cantidadDiasArrendado, String patenteDeVehiculo, String rutCliente){

        this.listaArriendo = new ListaArriendo(cantidadDiasArrendado);
        this.listaCliente = new ListaCliente(10);
        this.listaVehiculo = new ListaVehiculo(12);
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

    @Override
    public boolean inscribir(String rut, String nombre, String apellido, String fechaDeNacimiento, String tipoDeLicencia) {
        Cliente cliente = new Cliente(rut, nombre, apellido, fechaDeNacimiento, tipoDeLicencia);
        class RutChilenoValidator {

            public static boolean validarRut(String rut) {
                // Eliminar puntos y espacios en blanco.
                rut = rut.replace(".", "").replace("-", "").trim();

                if (!rut.matches("\\d{7,8}[0-9Kk]")) {
                    return false; // El formato del Rut es incorrecto
                }

                String cuerpoRut = rut.substring(0, rut.length() - 1);
                char digitoVerificador = rut.charAt(rut.length() - 1);

                int cuerpo;
                try {
                    cuerpo = Integer.parseInt(cuerpoRut);
                } catch (NumberFormatException e) {
                    return false; // El cuerpo del Rut no es un numero valido.
                }

                // Calcular el digito verificador esperado.
                int suma = 0;
                int multiplicador = 2;
                for (int i = cuerpoRut.length() - 1; i >= 0; i--) {
                    suma += Integer.parseInt(cuerpoRut.charAt(i) + "") * multiplicador;
                    multiplicador = multiplicador < 7 ? multiplicador + 1 : 2;
                }
                int digitoVerificadorEsperado = 11 - (suma % 11);
                if (digitoVerificadorEsperado == 11) {
                    digitoVerificadorEsperado = 0;
                }


                // Comprobar si el digito verificador es valido,
                if ((digitoVerificador == 'K' || digitoVerificador == 'k') && digitoVerificadorEsperado == 10) {
                    return true;
                }

                return digitoVerificador == Character.forDigit(digitoVerificadorEsperado, 10);
            }

        }

        return this.listaCliente.inscribir(cliente);
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


    /**
     * blla bla bla
     *
     * @param nombreArchivo
     */
    public boolean cargarArchivoVehiculo(String nombreArchivo) {
        In archivo = new In(nombreArchivo);
        while (archivo.hasNextLine()) {
            String linea = archivo.readLine();
            String[] campos = linea.split(",");
            String patente = campos[0];
            int numeroDeRuedas = Integer.parseInt(campos[1]);
            String tipoDeVehiculo = campos[2];
            int numeroDeAsientos = Integer.parseInt(campos[3]);
            String estado = campos[4];


            Vehiculo vehiculo= new Vehiculo(patente, numeroDeRuedas,tipoDeVehiculo, numeroDeAsientos, estado);
            boolean inscribir = this.listaVehiculo.inscribir(vehiculo);

            if (inscribir) {
                System.out.println("El nombre de cliente " + vehiculo + " ha sido inscrito correctamente.");
            }else {
                System.out.println("el nombre"+ vehiculo + " ya esta inscrito");
            }


        }
        archivo.close();

        return true;

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
        Vehiculo vehiculo = new Vehiculo(patente, numeroDeRuedas, tipoDeVehiculo, numeroDeAsientos, estado);

        return this.listaVehiculo.inscribir(vehiculo);
    }

    /**
     * @param nombreArchivo
     * @return
     */
    @Override
    public boolean cargarArchivoDeArriendo(String nombreArchivo) {
        In archivo = new In(nombreArchivo);
        while (archivo.hasNextLine()) {
            String linea = archivo.readLine();
            String[] campos = linea.split(",");
            String patenteVehiculo = campos[0];
            String rutCliente = campos[1];
            int cantidadDiasArriendo = Integer.parseInt(campos[2]);


            Arriendo arriendo= new Arriendo(patenteVehiculo, rutCliente,cantidadDiasArriendo);
            boolean agregar = this.listaArriendo.agregar(arriendo);

            if (agregar) {
                System.out.println("El nombre de cliente " + arriendo + " ha sido inscrito correctamente.");
            }else {
                System.out.println("el nombre"+ arriendo + " ya esta inscrito");
            }


        }
        archivo.close();

        return true;


    }

    @Override
    public boolean registrarArriendo(String patenteDeVehiculo, String rutCliente, int cantidadDiasArrendado) {
        return false;
    }

    @Override
    public String[] devolucionDeVehiculo(String rutCliente) {
        return new String[0];
    }

    /**
     * @return
     */

    public boolean registrarArriendo() {
        return false;
    }

    /**
     * @return
     */

    public boolean devolucionDeVehiculo() {
        return false;
    }

    /**
     * @return
     */

    public String[] desplegarEstadisticas() {
        return desplegarEstadisticas();
    }

    /**
     *
     */

    public void guardarArchivo() {

        return ;
    }
}
