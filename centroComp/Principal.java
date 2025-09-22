package centroComp;

public class Principal {
    public static void main(String[] args) {
        Centro cen = new Centro();
        Computadora c1 = new Computadora(3, 500000, true);
        Computadora c2 = new Computadora(5, 10000, true);
        Proceso p1 = new Proceso(1, 20);
        Proceso p2 = new Proceso(2, 4);
        
        cen.agregarComputadora(c1);
        cen.agregarComputadora(c2);
        cen.agregarProceso(p1);
        cen.agregarProceso(p2);

        System.out.println(cen);

         // Atiendo un proceso
        Proceso p = cen.obtenerSiguienteProceso();
        System.out.println("Proceso atendido: Orden " + p.getOrden() + " | Memoria " + p.getReqMemoria());

        // Busco una computadora disponible
        Computadora c = cen.obtenerComputadoraDisponible();
        if (c != null) {
            System.out.println("Computadora usada: Nro " + c.getNumero() + " | Velocidad " + c.getVelocidad());
        } else {
            System.out.println("No hay computadoras disponibles.");
        }

        System.out.println("\n=== Estado final ===");
        System.out.println(cen);
    }
}
