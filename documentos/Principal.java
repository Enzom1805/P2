package documentos;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Buscador b1 = new Buscador();
        Documento doc1 = new Documento("josias", "hola");
        Documento doc2 = new Documento("josias", "hola 2");
        Documento doc3 = new Documento("sas", "si a veces sas");

       
        doc1.AgregarPalabrasClave("josias");
        //doc2.AgregarPalabrasClave("julian");
        doc3.AgregarPalabrasClave("sas");
        doc1.AgregarPalabrasClave("hola");
        doc1.AgregarAutores("jorge");
        doc2.AgregarAutores("sas");
        doc3.AgregarAutores("jorge");
        b1.agregarDocumento(doc1);
        b1.agregarDocumento(doc2);
        b1.agregarDocumento(doc3);
        

       
        CondicionTitulo ct1 = new CondicionTitulo("josias");
        CondicionClave cv1 = new CondicionClave("sas");
        CondicionClave cv2 = new CondicionClave("hola");
        CondicionCont co1 = new CondicionCont("josias");
        CondicionAutor ca1 = new CondicionAutor(".."); 
        //A
        CondicionTituloExacto cte1 = new CondicionTituloExacto("josias");
        ArrayList<Documento> A = b1.BuscarDocumento(cte1);
        //System.out.println(A);
        //B
        
        CondicionAND ANDB = new CondicionAND (cv1, new CondicionTitulo("josias"));
        

        ArrayList<Documento> B = b1.BuscarDocumento(ANDB);
        
        //System.out.println(B); 

        //C
        ArrayList<Documento> C = b1.BuscarDocumento(cv1);
        //System.out.println(C);
        //D
       
        ArrayList<Documento> D = b1.BuscarDocumento(new CondicionSinClave());
        //System.out.println(D);
        //E
        CondicionAutorExacto auE = new CondicionAutorExacto("jorge");
        ArrayList<Documento> E = b1.BuscarDocumento(auE);
        //System.out.println(E);
        //F
        CondicionAND ANDF = new CondicionAND (cv2, new CondicionCont("hola"));
        ArrayList<Documento> F = b1.BuscarDocumento(ANDF);
        System.out.println(F);
    }
}
