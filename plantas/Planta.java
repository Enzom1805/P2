package plantas;

import java.time.LocalDate;


public class Planta {
    
    private String nombre;
    private String pais;
    private LocalDate fecha;
    private int id;

    public Planta(String nn, String pp, LocalDate ff){
        int i = 1;
        nombre = nn;
        pais = pp;
        fecha = ff;
        id = i++;
    }
    
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setId(int id) {
        this.id = id;
    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public String getPais() {
        return pais;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public int getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Planta [id=" + id + ", nombre=" + nombre + ", pais=" + pais + ", fecha=" + fecha + "]";
    }
}
