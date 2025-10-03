package viveros;

public class CondicionNombreC extends Condicion {
    private String nombre;

    public CondicionNombreC(String nombre) {
        this.nombre = nombre;
    }
    public boolean cumple(Planta planta) {
        return planta.getNombreCientifico().toLowerCase().contains(nombre);
    }
    
    
}
