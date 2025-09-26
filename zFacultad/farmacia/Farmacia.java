import java.util.ArrayList;

public class Farmacia {

    private ArrayList<Medicamento> medicamentos;

    // Suponemos que la farmacia acepta solo ciertos medicamentos para vender
    private Condicion condicionDeAceptacion;

    public Farmacia(Condicion condicionDeAceptacion) {
        this.condicionDeAceptacion = condicionDeAceptacion;
        this.medicamentos = new ArrayList<>();
    }

    public void addMedicamento(Medicamento nuevo) {
        if (this.condicionDeAceptacion.cumple(nuevo))
            this.medicamentos.add(nuevo); //No estamos chequeando repetidos
    }

    public ArrayList<Medicamento> buscarMedicamentos(Condicion condicion) {
        ArrayList<Medicamento> resultados = new ArrayList<>();
        for (int i = 0; i < this.medicamentos.size(); i++) {
            Medicamento medicamento_i = this.medicamentos.get(i);
            if (condicion.cumple(medicamento_i))
                resultados.add(medicamento_i);
        }
        return resultados;
    }

    /*
    NO ESTAMOS HACIENDO USO DE LOS CONCEPTOS DE POO
    public ArrayList<Medicamento> buscarMedicamentosPorLaboratorio(String laboratorio) {
        ArrayList<Medicamento> resultados = new ArrayList<>();
        for (int i = 0; i < this.medicamentos.size(); i++) {
            Medicamento medicamento_i = this.medicamentos.get(i);
            if (medicamento_i.getLabatorio().equalsIgnoreCase(laboratorio))
                resultados.add(medicamento_i);
        }
        return resultados;
    }

    public ArrayList<Medicamento> buscarMedicamentosPorNombre(String nombre) {
         ArrayList<Medicamento> resultados = new ArrayList<>();
         for (int i = 0; i < this.medicamentos.size(); i++) {
            Medicamento medicamento_i = this.medicamentos.get(i);
            if (medicamento_i.getNombre().contains(nombre))
                resultados.add(medicamento_i);
         }
         return resultados;
    }

    public ArrayList<Medicamento> buscarMedicamentosPorPrecio(double valor) {
         ArrayList<Medicamento> resultados = new ArrayList<>();
         for (int i = 0; i < this.medicamentos.size(); i++) {
            Medicamento medicamento_i = this.medicamentos.get(i);
            if (medicamento_i.getPrecio() < valor)
                resultados.add(medicamento_i);
         }
         return resultados;
    }
    */

}
