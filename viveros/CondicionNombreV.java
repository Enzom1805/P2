package viveros;

public class CondicionNombreV extends Condicion {
    private String nombre;

    public CondicionNombreV(String nombre) {
        this.nombre = nombre;
    }
    public boolean cumple(Planta planta) {
        return planta.getNombresVulgares().contains(nombre);
    }
    
}
