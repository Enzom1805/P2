package viveros;

public class CondicionRiegoMenor extends Condicion {
    private int riego;

    public CondicionRiegoMenor(int riego) {
        this.riego = riego;
    }
    public boolean cumple(Planta planta) {
        return planta.getRiego() < riego;
    }
}
