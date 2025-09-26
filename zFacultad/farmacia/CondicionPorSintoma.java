public class CondicionPorSintoma extends Condicion {
    private String sintoma;

    public CondicionPorSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public boolean cumple(Medicamento medicamento) {
        return medicamento.trataSintoma(this.sintoma);
    }

}
