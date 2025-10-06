package archivos;

public class Principal {
    public static void main(String[] args) {
        Directorio d1 = new Directorio("Dir 1");
        Directorio d2 = new Directorio("Dir 2");
        Directorio d3 = new Directorio("Dir 3");
        Archivo a1 = new Archivo("Ar a1", 5);
        Archivo b1 = new Archivo("Ar b1", 5);
        Archivo c1 = new Archivo("Ar c1", 5);
        
        Archivo a2 = new Archivo("Ar a2", 3);
        Archivo a3 = new Archivo("Ar a3", 8);

        d1.agregarElemento(a1);
        d1.agregarElemento(b1);
        d1.agregarElemento(c1);

        d2.agregarElemento(a2);
        d3.agregarElemento(a3);
        
        System.out.println("Tamanio " + d1.getTamanio());
        System.out.println("Cant elementos " + d1.getCantElemento());

        Link l1 = new Link(a3);
        d1.agregarElemento(l1);
        System.out.println(l1);
    }
}
