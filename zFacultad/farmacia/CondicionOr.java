public class CondicionOr extends Condicion {
    private Condicion condicion1;
    private Condicion condicion2;

    public CondicionOr(Condicion c1, Condicion c2) {
        this.condicion1 = c1;
        this.condicion2 = c2;
    }

    public boolean cumple(Medicamento medicamento) {
        return condicion1.cumple(medicamento) || 
            condicion2.cumple(medicamento);
    }

}
