package documentos;

public class CondicionSinClave extends Condicion {
   

    
    public boolean cumple(Documento doc){
        return doc.getPalabrasClave().isEmpty();
    }
}
