package agroquimicos;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Agroquimico> agroquimicos;

    public Empresa(String nombre){
        this.nombre = nombre;
        agroquimicos = new ArrayList<>();
    }
    public ArrayList<Agroquimico> agroParaEnfermedad(Enfermedad enf) {
    ArrayList<Agroquimico> resultado = new ArrayList<>();
    for(Agroquimico ag : agroquimicos) {
        if(ag.puedeTratar(enf)) {
            resultado.add(ag);
        }
    }
        return resultado;
    }
    public ArrayList<Agroquimico> agroParaCultivoYCultEnfermedad(Cultivo cul, Enfermedad enf) {
    ArrayList<Agroquimico> resultado = new ArrayList<>();
    for(Agroquimico ag : agroquimicos) {
        if(ag.puedeTratar(enf) && !ag.esCultivoAfect(cul)) {
            resultado.add(ag);
        }
    }
        return resultado;
    }
    public boolean tieneAgro(Agroquimico ag){
        return agroquimicos.contains(ag);
    }

    public void agregarAgro(Agroquimico ag){
        if(!agroquimicos.contains(ag)){
            agroquimicos.add(ag);
        }
    }

    public void eliminarAgro(Agroquimico ag){
        if(agroquimicos.contains(ag)){
            agroquimicos.remove(ag);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}
