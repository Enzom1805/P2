package documentos;

public class CondicionAND extends Condicion {
    private Condicion cond1;
    private Condicion cond2;

    public CondicionAND(Condicion cond1, Condicion cond2){
        this.cond1 = cond1;
        this.cond2 = cond2;
    }
    public boolean cumple(Documento doc){
        return cond1.cumple(doc) && cond2.cumple(doc);
    }
}
