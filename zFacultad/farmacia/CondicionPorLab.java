public class CondicionPorLab extends Condicion {
    private String lab;

    public CondicionPorLab(String lab) {
        this.lab = lab;
    }

    public boolean cumple(Medicamento medicamento) {
        return medicamento.getLabatorio().equalsIgnoreCase(this.lab);
    }

}
