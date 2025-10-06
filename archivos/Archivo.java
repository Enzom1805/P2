package archivos;

public class Archivo extends Elemento{
    private double tamanio;

    public Archivo(String nombre,double tamanio){
        super(nombre); 
        this.tamanio = tamanio;
    }
    @Override
    public double getTamanio() {
        return tamanio;
    }
    @Override
    public double getCantElemento(){
        return 1;
    }
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
}
