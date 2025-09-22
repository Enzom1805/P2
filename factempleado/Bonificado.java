package factempleado;

public class Bonificado extends Empleado {
    private int cantVentasMin;
    private int cantVentas;
    private double montoBono;

    public Bonificado(String nombre, String apellido, int dni, double sueldoMensual, int cantVentasMin, int cantVentas, double montoBono) {
        super(nombre, apellido, dni, sueldoMensual);
        this.cantVentasMin = cantVentasMin;
        this.cantVentas = cantVentas;
        this.montoBono = montoBono;
    }
    public int getCantVentasMin() {
        return cantVentasMin;
    }
    public void setCantVentasMin(int cantVentasMin) {
        this.cantVentasMin = cantVentasMin;
    }
    public int getCantVentas() {
        return cantVentas;
    }
    public void setCantVentas(int cantVentas) {
        this.cantVentas = cantVentas;
    }
    public double getMontoBono() {
        return montoBono;
    }
    public void setMontoBono(double montoBono) {
        this.montoBono = montoBono;
    }
    @Override
    public double getSueldoB() {
        if(cantVentas>=cantVentasMin){
            return super.getSueldoB() + montoBono;
        }
        else{
            return super.getSueldoB();
        }
    }
    @Override
    public String toString() {
        
        return super.toString() + " CanVentas " + getCantVentas() + " Bono otorgado " + getMontoBono();
    }
}