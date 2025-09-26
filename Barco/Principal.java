package Barco;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Puerto p1 = new Puerto();
    Camion c1 = new Camion(2, LocalDate.of(2025, 9, 10));
    Camion c2 = new Camion(5, LocalDate.of(2025, 9, 22));
    Camion c3 = new Camion(6, LocalDate.of(2025, 9, 3));
    Barco b1 = new Barco(2, 52);
    Barco b2 = new Barco(63, 400);
    Barco b3 = new Barco(100, 3);

    p1.agregarCamion(c1);
    p1.agregarCamion(c2);
    p1.agregarCamion(c3);
    p1.agregarBarco(b1);
    p1.agregarBarco(b2);
    p1.agregarBarco(b3);
    System.out.println(p1);
    
    }
}
