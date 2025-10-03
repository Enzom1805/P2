import java.util.ArrayList;

public class Comprimido extends Directorio{
    private double tasaCompresion;

    public Comprimido(String nombre, double tasaCompresion) {
        super(nombre);
        this.tasaCompresion = tasaCompresion;
    }

    public double getTasaCompresion() {
        return tasaCompresion;
    }

    public void setTasaCompresion(double tasaCompresion) {
        this.tasaCompresion = tasaCompresion;
    }

    @Override
    public double getTamanio() {
        return super.getTamanio() * tasaCompresion;
    }


}
