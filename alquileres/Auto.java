package alquileres;

public class Auto extends ItemAlquilable {
    private String patente;
    private int kms;
    private String tipo;
    private Cliente clienteQueLoAlquilo; // null si no está alquilado

    public Auto(String patente, int kms, String tipo){
        super("Vehiculo");
        this.patente = patente;
        this.kms = kms;
        this.tipo = tipo;
        this.clienteQueLoAlquilo = null;
    }
    public String getPatente() {
        return patente;
    }
    public int getKms() {
        return kms;
    }
    public String getTipo() {
        return tipo;
    }
    @Override
    public boolean estaDisponible(){
        return clienteQueLoAlquilo == null;
    }

    @Override
    public Cliente clienteQueAlquilo(){
        return clienteQueLoAlquilo;
    }

    @Override
    public void registrarAlquiler(Cliente cliente){
        this.clienteQueLoAlquilo = cliente;
    }
    @Override
    public String toString() {
        String clienteTexto = (clienteQueLoAlquilo != null) ? clienteQueLoAlquilo.getNombre() : "Nadie";
        return "Patente: " + getPatente() + " Kilometraje: " + getKms() + " Tipo: " + getTipo() + 
        " Estado: " + (estaDisponible() ? "Disponible" : "Alquilado Cliente: " + clienteTexto) ;
    }
}