package alquileres;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan Perez", 12345678);
        Cliente c2 = new Cliente("Maria Lopez", 87654321);

        Pelicula p1 = new Pelicula("El Señor de los Anillos", "josias", 2);
        Pelicula p2 = new Pelicula("Matrix", "alvaro" , 1);
        Auto a1 = new Auto("ABC123", 50000, "Nafta");
        Auto a2 = new Auto("XYZ987", 20000, "Electrico");

        Alquiler alq1 = new Alquiler(c1, p1, LocalDate.now().plusDays(2));
        Alquiler alq2 = new Alquiler(c2, a1, LocalDate.now().minusDays(1));
        Alquiler alq3 = new Alquiler(c1, p2, LocalDate.now().plusDays(5));

        System.out.println("=== Clientes ===");
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("\n=== Items ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(a1);
        System.out.println(a2);

        System.out.println("\n=== Alquileres ===");
        System.out.println(alq1);
        System.out.println(alq2);
        System.out.println(alq3);
    }
    
}
