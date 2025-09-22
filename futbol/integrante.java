package futbol;

import java.time.LocalDate;

public class integrante {
    private String nombre;
    private String apellido;
    private int pasaporte;
    private LocalDate fecha;

    public integrante (String nn, String ap, int pp, LocalDate ff){
        nombre = nn;
        apellido = ap;
        pasaporte = pp;
        fecha = ff;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setPasaporte(int pasaporte) {
        this.pasaporte = pasaporte;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public int getPasaporte() {
        return pasaporte;
    }
}
