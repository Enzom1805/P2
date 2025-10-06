package archivos;

import java.util.ArrayList;

public class Directorio extends Elemento{
    private ArrayList<Elemento> elementos;

    public Directorio(String nombre){
        super(nombre);
        elementos = new ArrayList<>();
    }
    public void agregarElemento(Elemento el){
        if(!elementos.contains(el)){
            elementos.add(el);
        }
    }
    public double getTamanio(){
        double tamanio = 0;
        for(Elemento ee : elementos){
            tamanio += ee.getTamanio();
        }
        return tamanio;
    }
    public double getCantElemento(){
        double cant = 1;
        for(Elemento ee : elementos){
            cant += ee.getCantElemento();
        }
        return cant;
    }
}
