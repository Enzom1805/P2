package Barco;
public class Barco {
    private int numeroBarco;
    private int capacidad;

    public Barco(int numeroBarco,int capacidad){
        this.numeroBarco = numeroBarco;
        this.capacidad = capacidad;
    }
    public int getNumeroBarco() {
        return numeroBarco;
    }
    public int getCapacidad() {
        return capacidad;
    }
}
