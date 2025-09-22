package factempleado;

public class Vendedor extends Empleado {
    
    private int diasMes;
    private int cantVentas;

    public Vendedor(String nombre, String apellido, int dni, double sueldoB, int cantVentas, int diasMes){
        super(nombre,apellido,dni,sueldoB);
        this.cantVentas = cantVentas;
        this.diasMes = diasMes;
    }
    public int getdiasMes(){
        if(diasMes != 0 && diasMes >= 28 && diasMes <=31){
            return diasMes;
        }
        else{
            return 0;
        }
    }
    public int getCantVentas() {
        return cantVentas;
    }
    public double getExtra() {
       return (double)(cantVentas / diasMes) ;
    }
    
    @Override
    public double getSueldoB() {
         return super.getSueldoB() + (super.getSueldoB() * getExtra() / 100);
    }
    @Override
    public String toString() {
        return super.toString() + "Cantidad de Ventas: " + getCantVentas() + " Extra por ventas " + getExtra();
    }
}
