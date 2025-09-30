package agroquimicos;

import java.util.ArrayList;

public class Cultivo {
    private String nombre;
    private ArrayList<Enfermedad> enfermedadesFrec;

    public Cultivo(String nombre){
        this.nombre = nombre;
        enfermedadesFrec = new ArrayList<>();
    }
    public boolean leSirve(Agroquimico ag) {
    for(Enfermedad enf : enfermedadesFrec) {
        // El agroquímico puede tratar la enfermedad y no está desaconsejado para este cultivo
        if(ag.puedeTratar(enf) && !ag.esCultivoAfect(this)) {
            return true;
        }
    }
    return false;
}
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void agregarEnfermedadeFrec(Enfermedad enf){
        if(!enfermedadesFrec.contains(enf)){
            enfermedadesFrec.add(enf);
        }
    }
    public void eliminarEnfermedadeFrec(Enfermedad enf){
        if(enfermedadesFrec.contains(enf)){
            enfermedadesFrec.remove(enf);
        }
    }
    @Override
    public String toString() {
        
        return "Nombre: " + getNombre();
    }
}
