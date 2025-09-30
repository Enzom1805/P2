package agroquimicos;

public class Principal {
    public static void main(String[] args) {
        Empresa em1 = new Empresa("josCo");
        Agroquimico a1 = new Agroquimico("josSavior");
        Agroquimico a2 = new Agroquimico("nojos");

        a1.agregarPatologia("A");
        a1.agregarPatologia("B");
        a2.agregarPatologia("A");
        a2.agregarPatologia("B");

        em1.agregarAgro(a1);
        em1.agregarAgro(a2);

        Cultivo c1 = new Cultivo(" josias ");
      

        Enfermedad e1 = new Enfermedad("antijos");
        
        a1.agregarCultivoNo(c1);
        e1.agregarPatologia("A");
        e1.agregarPatologia("B");
       
        c1.agregarEnfermedadeFrec(e1);

        System.out.println(em1.agroParaCultivoYCultEnfermedad(c1, e1));
        System.out.println(em1.agroParaEnfermedad(e1));
        
    }
}
