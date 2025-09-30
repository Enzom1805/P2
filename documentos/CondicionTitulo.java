package documentos;

public class CondicionTitulo extends Condicion {
    private String titulo;

    public CondicionTitulo(String titulo){
        this.titulo = titulo;
    }
    public boolean cumple(Documento doc){
        return doc.getTitulo().contains(titulo);
    }
}
