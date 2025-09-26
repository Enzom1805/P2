public class CondicionPorPrecioMenor extends Condicion {
    private double precio;

    public CondicionPorPrecioMenor(double precio) {
        this.precio = precio;
    }

    public boolean cumple(Medicamento medicamento) {
        return medicamento.getPrecio() < precio;
    }
}
