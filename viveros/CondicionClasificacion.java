package viveros;

public class CondicionClasificacion extends Condicion {
    private String clasificacion;

    public CondicionClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
    public boolean cumple(Planta planta) {
        return planta.getClasificacionSuperior().equalsIgnoreCase(clasificacion);
    }
}
