package viveros;

import java.util.ArrayList;

class Principal {
    public static void main(String[] args) {
        Vivero v1 = new Vivero();
        Planta p1 = new Planta("Josius Auereum", "NN", "Rosas", "sas", true, 2, 9);
        Planta p2 = new Planta("Rosem Nigus", "Crassula", "Sos", "Claro si", false, 1, 6);
        Planta p3 = new Planta("Lilium", "Crassula", "Liliopsida", "No", true, 8, 3);
        p1.agregarNombreVulgar("Lengua de suegra");
        p2.agregarNombreVulgar("Lengua de suegra");
        p3.agregarNombreVulgar("Lirio");
        v1.agregarPlanta(p1);
        v1.agregarPlanta(p2);
        v1.agregarPlanta(p3);
        
         // A. Nombre cientifico contiene "auereum" -Funciona
        /*CondicionNombreC cA = new CondicionNombreC("auereum");
        ArrayList<Planta> pA = v1.BuscarPlanta(cA);
        System.out.println("A) Nombre Cientifico Auereum \n" + pA); */
        
        // B. Nombre vulgar "lengua de suegra" -Funciona
        /*CondicionNombreV cB = new CondicionNombreV("Lengua de suegra");
        ArrayList<Planta> pB = v1.BuscarPlanta(cB);
        System.out.println("B) Nombre Vulgar Lengua suegra \n" + pB); */

        // C. Clasificacion "Crassula" -Funciona
        /*CondicionClasificacion cC = new CondicionClasificacion("Crassula");
        ArrayList<Planta> pC = v1.BuscarPlanta(cC);
        System.out.println("C) Clasificacion Crassula \n" + PC);*/

        //D. Sol mayor a 5 y riego menor a 3 -Funciona
        /* CondicionRiegoMenor cr1 = new CondicionRiegoMenor(3);
        CondicionSolMayor cs1 = new CondicionSolMayor(5);
        CondicionAnd cD = new CondicionAnd(cr1, cs1);
        ArrayList<Planta> pD = v1.BuscarPlanta(cD);
        System.out.println("D) Condicion riego y sol 1 \n " + pD);*/

        //E. Sol menor a 4 y riego mayor a 4 -Funciona
        /*CondicionRiegoMayor cr2 = new CondicionRiegoMayor(4);
        CondicionSolMenor cs2 = new CondicionSolMenor(4);
        CondicionAnd cE = new CondicionAnd(cr2, cs2);
        ArrayList<Planta> pE = v1.BuscarPlanta(cE);
        System.out.println("E) Condicion riego y sol 2 \n " + pE);*/

        //F. Planta de "interior" con riego menor a 3 -Funciona
        /*CondicionExtOInt ci1 = new CondicionExtOInt(true);
        CondicionRiegoMenor cr3 = new CondicionRiegoMenor(3);
        CondicionAnd cF = new CondicionAnd(ci1, cr3);
        ArrayList<Planta> pF = v1.BuscarPlanta(cF);
        System.out.println("F) Condicion interior y riego menor a 3\n" + pF);*/
        
        //G. Combinacion logica -Funciona
        CondicionNombreC cc1 = new CondicionNombreC("rosem");
        CondicionNombreV cv1 = new CondicionNombreV("rosa");
        CondicionExtOInt ci2 = new CondicionExtOInt(false);
        
        CondicionOr co1 = new CondicionOr(cc1, new CondicionNot(cv1));
        CondicionAnd cG = new CondicionAnd(co1, ci2);
        ArrayList<Planta> pG = v1.BuscarPlanta(cG);
        System.out.println("G) Combinacion logica\n" + pG);

         
    }    
}
