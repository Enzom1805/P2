package Barco;
import java.time.LocalDate;
public class Camion {
    private int numeroCamion;
    private LocalDate fechaCarga;

    public Camion(int numeroCamion,LocalDate fechaCarga ){
        this.numeroCamion = numeroCamion;
        this.fechaCarga = fechaCarga;

   }
   public int getNumeroCamion() {
       return numeroCamion;
   }
   public LocalDate getFechaCarga() {
       return fechaCarga;
   }
}
