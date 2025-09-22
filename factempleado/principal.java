package factempleado;

public class principal {
     public static void main(String[] args) {
        Empresa em = new Empresa();
        Empleado e1 = new Empleado("julian", "gomez", 5422222, 50000);
        Vendedor v1 = new Vendedor("pablo", "duquez", 46666666, 50000, 300,  30);   
        Bonificado b1 = new Bonificado("ivan", "si", 677777, 30000, 40, 3, 5);
        em.agregarEmpleado(e1);
        em.agregarEmpleado(v1);
        em.agregarEmpleado(b1);
        
        System.out.println(em);
        System.out.println("total gastado en sueldo de giles" + em.totalSueldos());
        
    }
}
