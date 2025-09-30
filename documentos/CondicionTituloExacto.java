package documentos;

public class CondicionTituloExacto extends Condicion {
    private String titulo;
    
    public CondicionTituloExacto(String titulo){
        this.titulo = titulo;
    }
    public boolean cumple(Documento doc){
         return doc.getTitulo().equalsIgnoreCase(this.titulo);
    }
}
