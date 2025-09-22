package encuestas;
/*1 Sistema de encuestas
Una empresa consultora desea desarrollar un sistema el cual le permita informatizar su
mecanismo de encuestas. La compañía se encarga de realizar encuestas para empresas
de terceros o para el gobierno. Una encuesta se compone de un conjunto de preguntas,
una persona encuestada y el empleado que realizo la encuesta. La compañía guarda
todas las encuestas realizadas. Los empleados cobran un plus por cantidad de encuestas
realizadas, con lo cual la empresa desea conocer el número de encuestas que realizó
cada empleado. Para evitar falsificación de datos, en la encuesta figura el número de
documento de la persona. Una misma persona no puede llenar dos veces la misma
encuesta, pero si una encuesta diferente.
Consejo: Diferenciar entre formulario a responder y formulario respondido.
Extra: ¿Qué cambiaría el eliminar la restricción de solo una encuesta por persona?
*/
public class Compania{
    public static void main(String[] args) {
        Formulario f1 = new Formulario(101,"Anni Ted Talk","magnífico, 5 estrellas");
        
        Empleado e1 = new Empleado("julian","weich", 3);
        Cliente c1 = new Cliente(42000000, "uriel", "josias@gmail.com");
        Empleado e2 = new Empleado( "jorge", "sas", 4 );
        FormRespondido r1 = new FormRespondido(f1,c1,e1);
        

        f1.agregarPregunta("Cuántos clavo clavitos clavó Pablito?");
        f1.agregarPregunta("En que banquito está Armando Esteban Quito?");
       
        r1.agregarRespuesta("Pablito clavo 50 milllones de clavitos, es un esclavo de china");
        r1.agregarRespuesta("En el 2");
        
        for(int i = 0; i < f1.getNroPregunta() ; i++){
            System.out.println("Pregunta nro "+ (i + 1) + ": " + f1.getPregunta(i));
            System.out.println("Respuesta nro " + (i + 1) + ": " + r1.getRespuesta(i));
           
        }

        System.out.println("Formulario a cargo de: " + r1.getEmpleado().getNombre() + " " + r1.getEmpleado().getApellido() + " Legajo: " +
        r1.getEmpleado().getidEmpleado() + " " + r1.getEmpleado().getEncuestasRealizadas());
        System.out.println("Fue completado por: " + r1.getCliente().getNombre() + " " + r1.getCliente().getEmail() + " DNI: " + r1.getCliente().getDni());
        
       
        Formulario f2 = new Formulario(102,"Anni Ted Talk","magnífico, 52 estrellas");
        FormRespondido r2 = new FormRespondido(f2, c1, e1);
        r2.agregarRespuesta("noooo");
        f2.agregarPregunta("josias");

         for(int i = 0; i < f2.getNroPregunta() ; i++){
            System.out.println("Pregunta nro "+ (i + 1) + ": " +  f2.getPregunta(i));
            System.out.println("Respuesta nro " + (i + 1) + ": " + r2.getRespuesta(i));
        }

        System.out.println("Formulario a cargo de: " + r2.getEmpleado().getNombre() + " " + r2.getEmpleado().getApellido() + " Legajo: " +
        r2.getEmpleado().getidEmpleado() + " " + r2.getEmpleado().getEncuestasRealizadas());
        System.out.println("Fue completado por: " + r2.getCliente().getNombre() + " " + r2.getCliente().getEmail() + " DNI: " + r2.getCliente().getDni());

        Formulario f3 = new Formulario(102,"Anni Ted Talk","magnífico, 52 estrellas");
        FormRespondido r3 = new FormRespondido(f2, c1, e2);
        r3.agregarRespuesta("SIIII");
        f3.agregarPregunta("JOSIAAAAS!!!");

         for(int i = 0; i < f3.getNroPregunta() ; i++){
            System.out.println("Pregunta nro "+ (i + 1) + ": " +  f3.getPregunta(i));
            System.out.println("Respuesta nro " + (i + 1) + ": " + r3.getRespuesta(i));
        }

        System.out.println("Formulario a cargo de: " + r3.getEmpleado().getNombre() + " " + r3.getEmpleado().getApellido() + " Legajo: " +
        r3.getEmpleado().getidEmpleado() + " " + r3.getEmpleado().getEncuestasRealizadas());
        System.out.println("Fue completado por: " + r3.getCliente().getNombre() + " " + r3.getCliente().getEmail() + " DNI: " + r3.getCliente().getDni());
    }
}