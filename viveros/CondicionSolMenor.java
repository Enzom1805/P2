package viveros;

public class CondicionSolMenor extends Condicion {
    private int sol;

    public CondicionSolMenor(int sol) {
        this.sol = sol;
    }
    public boolean cumple(Planta planta) {
        return planta.getSol() < sol;
    }
}
