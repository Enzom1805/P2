import javax.swing.*;
import java.util.ArrayList;

public class Directorio extends ElementoSA{
    private ArrayList<ElementoSA> elementos;

    public Directorio(String nombre) {
        super(nombre);
        this.elementos = new ArrayList<>();
    }

    @Override
    public double getTamanio() {
        double tamanio = 0;
        for (ElementoSA elemento : elementos) {
            tamanio += elemento.getTamanio();
        }
        return tamanio;
    }

    public void addElemento(ElementoSA elemento){
        if(!elementos.contains(elemento)) {
            this.elementos.add(elemento);
        }
    }

    public int cantElementos(){
        int cant = 0;

        for  (ElementoSA elemento : elementos) {
            cant += elemento.cantElementos();
        }

        return  1 + cant;
    }
}
