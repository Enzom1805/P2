package documentos;

public class CondicionNOT extends Condicion {
    private Condicion cond;

    public CondicionNOT(Condicion cond){
        this.cond  = cond;
    }
    public boolean cumple(Documento doc){
        return !cond.cumple(doc);
    }
}