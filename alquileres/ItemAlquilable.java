package alquileres;

public abstract class ItemAlquilable {
    private String nombre;
    

    public ItemAlquilable(String nombre){
        this.nombre = nombre;
        
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

   
    public abstract boolean estaDisponible();
    public abstract void registrarAlquiler(Cliente cliente);
    public abstract Cliente clienteQueAlquilo();

    @Override
    public String toString() {
       
        return "tipo: " + getNombre();
    }
}