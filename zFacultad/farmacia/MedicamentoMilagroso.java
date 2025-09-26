public class MedicamentoMilagroso extends Medicamento {

    public MedicamentoMilagroso(String nombre, String labatorio, double precio) {
        super(nombre, labatorio, precio);
    }
    
    public boolean trataSintoma(String sintoma) {
        return true;
    }

}
