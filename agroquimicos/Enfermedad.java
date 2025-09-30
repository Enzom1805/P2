package agroquimicos;
import java.util.ArrayList;
public class Enfermedad {
    private String nombre;
    private ArrayList<String> patologias;
    
    public Enfermedad(String nombre){
        this.nombre = nombre;
        patologias = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<String> getPatologias(){
        ArrayList<String> patologiaCop = new ArrayList<>();
        for(String pat : patologias){
            patologiaCop.add(pat);
        }
        return patologiaCop;
    }
    public void agregarPatologia(String pat){
        if(!patologias.contains(pat)){
            patologias.add(pat);
        }
    }
    public void eliminarPatologia(String pat){
        if(patologias.contains(pat)){
            patologias.remove(pat);
        }
    }
    public boolean tienePatologia(String pat){
        return patologias.contains(pat);
    }
    
    
}
