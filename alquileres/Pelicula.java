package alquileres;

public class Pelicula extends ItemAlquilable{
    private String titulo;
    private String director;
    private int cantCopias;
    

    public Pelicula(String titulo, String director, int cantCopias){
        super("Pelicula");
        this.titulo = titulo;
        this.director = director;
        this.cantCopias = cantCopias;
        
    }
    public boolean estaDisponible(){
        return cantCopias > 0;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getDirector() {
        return director;
    }
    public int getCantCopias() {
        return cantCopias;
    }
     @Override
    public Cliente clienteQueAlquilo(){
        return null;
    }
    @Override
    public void registrarAlquiler(Cliente cliente){
        if(cantCopias > 0){
            cantCopias--;
        }
    }
    
    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + " Director: " + getDirector() + " Cantidad disponible: " + getCantCopias();
    }
}
