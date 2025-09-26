import java.util.ArrayList;

public class Medicamento {
    private String nombre;
    private String labatorio;
    private double precio;
    private ArrayList<String> sintomas;

    public Medicamento(String nombre, String labatorio, double precio) {
        this.nombre = nombre;
        this.labatorio = labatorio;
        this.precio = precio;
        this.sintomas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLabatorio() {
        return labatorio;
    }

    public void setLabatorio(String labatorio) {
        this.labatorio = labatorio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void addSintoma(String sintoma) {
        if (!this.sintomas.contains(sintoma))
            this.sintomas.add(sintoma);
    }

    public boolean trataSintoma(String sintoma) {
        return this.sintomas.contains(sintoma);
    }

    public String toString() {
        return this.getNombre() + " Lab: " + this.getLabatorio() + "Sintomas: " + this.sintomas; 
    }
    

}
