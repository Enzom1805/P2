package agroquimicos;
import java.util.ArrayList;

public class Agroquimico {
    private String nombre;
    private ArrayList<String> patTratadas;
    private ArrayList<Cultivo> cultivosNo;

    public Agroquimico(String nombre){
        this.nombre = nombre;
        patTratadas = new ArrayList<>();
        cultivosNo = new ArrayList<>();
    }
    public boolean puedeTratar(Enfermedad enf){
        for(String pat : enf.getPatologias()){
            if(!patTratadas.contains(pat)){
                return false;
            }
        }
        return true;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean trataPatologia(String pat){
        return patTratadas.contains(pat);
    }

    public void agregarPatologia(String pat){
        if(!patTratadas.contains(pat)){
            patTratadas.add(pat);
        }
    }
    public void eliminarPatologia(String pat){
        if(patTratadas.contains(pat)){
            patTratadas.remove(pat);
        }
    }
    
    public boolean esCultivoAfect(Cultivo cul){
        return cultivosNo.contains(cul);
    }

    public void agregarCultivoNo(Cultivo cul){
        if(!cultivosNo.contains(cul)){
            cultivosNo.add(cul);
        }
    }

    public void eliminarCultivoNo(Cultivo cul){
        if(cultivosNo.contains(cul)){
            cultivosNo.remove(cul);
        }
    }
     @Override
    public String toString() {
        return "Agroquimico: " + getNombre() + ", Patologias tratadas: " + patTratadas;
    }
}
