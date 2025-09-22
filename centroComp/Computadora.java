package centroComp;

public class Computadora {
    private int numero;
    private int velocidad;
    private boolean disponible;

    public Computadora(int numero,int velocidad, boolean disponible){
        this.numero = numero;
        this.velocidad = velocidad;
        this.disponible = disponible;
    }
    public int getNumero() {
        return numero;
    }
    public int getVelocidad() {
        return velocidad;
    }
    public boolean getDisponible(){
        return disponible;
    }
    
}
