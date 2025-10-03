package viveros;

public class CondicionNot extends Condicion {
    private Condicion cond1;

    public CondicionNot(Condicion cond1){
        this.cond1 = cond1;
    }
    public boolean cumple(Planta planta){
        return !cond1.cumple(planta);
    }
}
