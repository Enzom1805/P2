package documentos;

public class CondicionAutorExacto extends Condicion {
    private String autor;
    
    public CondicionAutorExacto(String autor){
        this.autor = autor;
    }
    public boolean cumple(Documento doc){
         return doc.esAutor(this.autor);
    }
    
}