public class Empleado  {
    private String nombre;
    private int cantEncuestas;

    public Empleado(String nombre, int cantEncuestas){
        this.nombre = nombre;
        this.cantEncuestas = cantEncuestas;
    }
    public String getNombreEmpleado(){
        return nombre;
    }
    public int getCantidadEncuestas(){
        return cantEncuestas;
    }
}
