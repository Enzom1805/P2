package viveros;

public class CondicionRiegoMayor extends Condicion {
    private int riego;

    public CondicionRiegoMayor(int riego) {
        this.riego = riego;
    }
    public boolean cumple(Planta planta) {
        return planta.getRiego() > riego;
    }
    
}
