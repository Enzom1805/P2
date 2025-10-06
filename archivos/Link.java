package archivos;

public class Link extends Elemento {
    private static double tamanio = 1.0;
    private Elemento objetivo;
    private static final String Prefijo = "Acceso directo a:";

    public Link (Elemento objetivo){
        super(Prefijo + objetivo.getNombre());
        this.objetivo = objetivo;
    }
    @Override
    public double getTamanio(){
        return tamanio;
    }
    @Override
    public double getCantElemento() {
        
        return 1;
    }
    
}
