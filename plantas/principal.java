package plantas;

import java.time.LocalDate;

public class principal {
    
    public static void main(String[] args) {
        Jardin jj = new Jardin();
        Planta pp = new Planta("Lily", "Japon", LocalDate.now());
        Planta p1 = new Planta("Rosa", "Argentina", LocalDate.now());
        Planta p2 = new Planta("Tulipán", "Holanda", LocalDate.now());
        Planta p3 = new Planta("Bambú", "China", LocalDate.now());

        jj.AgregarPlanta(pp);
        jj.AgregarPlanta(p1);
        jj.AgregarPlanta(p2);
        jj.AgregarPlanta(p3);
        
        System.out.println(jj);
    }

}
