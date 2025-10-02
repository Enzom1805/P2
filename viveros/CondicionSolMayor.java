package viveros;

public class CondicionSolMayor extends Condicion {
    private int sol;

    public CondicionSolMayor(int sol) {
        this.sol = sol;
    }
    public boolean cumple(Planta planta) {
        return planta.getSol() > sol;
    }
    
}
