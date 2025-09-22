package factempleado;

public class Empleado  {
    private String nombre;
    private String apellido;
    private int dni; 
    private double sueldoB; 

    public Empleado (String nombre, String apellido, int dni, double sueldoB){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoB = sueldoB;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }
    public void setSueldoB(double sueldoB) {
        this.sueldoB = sueldoB;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getDni() {
        return dni;
    }
    public double getSueldoB() {
        return sueldoB;
    }
    @Override
    public String toString() {
        
        return "Nombre completo: " + getNombre() + " " + getApellido() + " DNI: " + getDni() + "\n Sueldo: " + getSueldoB()    ;
    }
}