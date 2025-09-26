public class CondicionNot extends Condicion {
    private Condicion condicion;

    public CondicionNot(Condicion c) {
        this.condicion = c;
    }

    @Override
    public boolean cumple(Medicamento medicamento) {
        return !condicion.cumple(medicamento);
    }
}
