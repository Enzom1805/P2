package encuestas;

public class Empleado {
    private String nombre;
    private String apellido;
    private int idEmpleado;
    private int cantEncuestasRealizadas;
    
    public Empleado(String nombre, String apellido, int idEmpleado){
        this.nombre = nombre ;
        this.apellido = apellido;
        this.idEmpleado = idEmpleado;
        this.cantEncuestasRealizadas = 0;
    }
    public void realizoEncuesta(){
        cantEncuestasRealizadas++;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public int getidEmpleado(){
        return idEmpleado;
    }
    public int getEncuestasRealizadas(){
        return cantEncuestasRealizadas;
    }
}
