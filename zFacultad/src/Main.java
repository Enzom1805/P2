import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Directorio a = new Directorio("A");
        Directorio b = new Directorio("B");
        Directorio c = new Directorio("C");

        Archivo b1 = new Archivo("b1", 1);
        Archivo b2 = new Archivo("b2", 2);
        Archivo b3 = new Archivo("b3", 3);

        Archivo a1 = new Archivo("a1", 10);
        Archivo c1 = new Archivo("c1", 10);

        b.addElemento(b1);
        b.addElemento(b2);
        b.addElemento(b3);

        a.addElemento(b);
        a.addElemento(a1);
        a.addElemento(c);

        c.addElemento(c1);

        System.out.println("Tamanio: " + a.getTamanio());

        c.addElemento(new Archivo("c2", 5));

        System.out.println("Tamanio: " + a.getTamanio());


        System.out.println("Cantidad de elementos: " + a.cantElementos());

        AccesoDirecto linkAC1 = new AccesoDirecto(c1);

        b.addElemento(linkAC1);

    }
}
