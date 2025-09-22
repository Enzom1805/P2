package futbol;

import java.time.LocalDate;

public class futbolista extends integrante {
    private String posicion;
    private boolean zurdo;
    private boolean diestro;
    private int cantGoles;
    
    public futbolista(String nombre, String apellido, int pasaporte, LocalDate fecha, String pp, boolean zz, boolean dd, int cc){
        super(nombre,apellido,pasaporte,fecha);
        posicion = pp;
        zurdo = zz;
        diestro = dd;
        cantGoles = cc;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public void setZurdo(boolean zurdo) {
        this.zurdo = zurdo;
    }
    public void setDiestro(boolean diestro) {
        this.diestro = diestro;
    }
    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }
    public String getPosicion() {
        return posicion;
    }
    

}
