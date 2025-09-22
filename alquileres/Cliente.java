package alquileres;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private int dni;
    private ArrayList<Alquiler> alquileres;
    

    public Cliente(String nombre, int dni){
        this.nombre = nombre;
        this.dni = dni;
        this.alquileres = new ArrayList<Alquiler>();
       
    }

    // Getters
    public String getNombre() {
         return nombre; 
        }
    public int getDni() {
         return dni; 
        }
    public ArrayList<Alquiler> getAlquileres() {
         return alquileres; 
        }
    

    
    public void agregarAlquiler(Alquiler alquiler){
        alquileres.add(alquiler);
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder("Nombre: " + getNombre() + " DNI: " + getDni() + "\n");
       for(Alquiler al : alquileres){
            sb.append(al).append("\n");
       }
       return sb.toString();
    }
    
}