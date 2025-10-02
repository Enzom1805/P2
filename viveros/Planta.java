package viveros;

import java.util.ArrayList;

public class Planta {

    private String nombreCientifico;
    private ArrayList<String> nombresVulgares;
    private String clasificacionSuperior;
    private String familia;
    private String clase;
    private boolean interior;
    private int riego;
    private int sol;
    
    public Planta(String nombreCientifico, String clasificacionSuperior, String familia  ,String clase ,boolean interior,
    int riego, int sol) {
        this.nombreCientifico = nombreCientifico;
        this.clasificacionSuperior = clasificacionSuperior;
        this.familia = familia;
        this.clase = clase;
        this.interior = interior;
        this.riego = riego;
        this.sol = sol;
        }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    public String getClasificacionSuperior() {
        return clasificacionSuperior;
    }
    public String getFamilia() {
        return familia;
    }
    public String getClase() {
        return clase;
    }
    public int getRiego() {
        return riego;
    }
    public int getSol() {
        return sol;
    }
    public void agregarNombreVulgar(String nom){
        nombresVulgares.add(nom);
    }
    public ArrayList<String> getNombresVulgares(){
        ArrayList<String> Vulgares = new ArrayList<>();
        for(String nv : nombresVulgares){
            Vulgares.add(nv);
        }
        return Vulgares;
    }
    
}