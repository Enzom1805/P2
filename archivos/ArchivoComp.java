package archivos;

public class ArchivoComp extends Directorio {
    private double tasaDeCompresion;

    public ArchivoComp(String nombre, double tasaDeCompresion){
        super(nombre);
        this.tasaDeCompresion = tasaDeCompresion;
    }
    public double getTasaDeCompresion() {
        return tasaDeCompresion;
    }
    public void setTasaDeCompresion(double tasaDeCompresion) {
        this.tasaDeCompresion = tasaDeCompresion;
    }
    @Override
    public double getTamanio(){
        return super.getTamanio() * tasaDeCompresion;
    }
}
