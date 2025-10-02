package viveros;

public class CondicionClase extends Condicion {
    private String clase;

    public CondicionClase(String clase) {
        this.clase = clase;
    }
    public boolean cumple(Planta p) {
        return p.getClase().equalsIgnoreCase(clase);
    }
}
