package viveros;

public class CondicionExtOInt extends Condicion{
    private boolean interior;

    public CondicionExtOInt(boolean interior){
        this.interior = interior;
    }
    public boolean cumple(Planta planta){
        return planta.getInterior() == interior;
    }
    
}
