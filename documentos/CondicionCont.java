package documentos;

public class CondicionCont extends Condicion {
     private String contenido;
    
    public CondicionCont(String contenido){
        this.contenido = contenido;
    }
    public boolean cumple(Documento doc){
         return doc.getContenido().contains(this.contenido);
    }
}
