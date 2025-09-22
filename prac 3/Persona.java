
public class Persona {
    private String nombre;
    private int dni;

    public Persona (String nombre,int dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    public String getNombrePersonaEncuestada(){
        return nombre;
    }
    public int getDni(){
        return dni;
    }
}


