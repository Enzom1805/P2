package viveros;

public class CondicionFamilia extends Condicion {
    private String familia;

    public CondicionFamilia(String familia) {
        this.familia = familia;
    }

    
    public boolean cumple(Planta planta) {
        return planta.getFamilia().equalsIgnoreCase(familia);
    }
    
}
