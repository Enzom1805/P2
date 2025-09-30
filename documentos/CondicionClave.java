package documentos;

public class CondicionClave extends Condicion{
    private String palabra;
    
    public CondicionClave(String palabra){
        this.palabra = palabra;
    }
    public boolean cumple(Documento doc){
         return doc.getPalabrasClave().contains(palabra);
    }
}
