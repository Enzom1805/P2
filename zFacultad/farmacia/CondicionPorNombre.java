public class CondicionPorNombre extends Condicion {

    private String nombre;

    public CondicionPorNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean cumple(Medicamento medicamento) {
        return medicamento.getNombre().contains(nombre);
    }

}
