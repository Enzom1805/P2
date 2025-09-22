import java.util.ArrayList;

public class encuestaRespondida extends empresa {
    private Pregunta pregunta;
    private encuestaFormulario formulario;
    private Empleado empleado;
    private Persona persona;
    private Respuesta respuestas;

    public encuestaRespondida(Persona persona, Empleado empleado, encuestaFormulario formulario){
        Persona persona2 = new Persona("julian", 46555828);
        Empleado empleado2 = new Empleado("jorge", 3);
        Respuesa r1 = new Respuesta(pregunta, )
        this.formulario = formulario;
    }
    public ArrayList<Respuesta> getRespuestas(){
        return respuestas;
    }
    public Pregunta getPregunta(){
        return pregunta;
    }
    public Empleado getEmpleado(){
        return empleado;
    }
    public Persona getPersona(){
        return persona;
    }
    
    
    public void mostrarRespuestas(){
        for(Respuesta r : getRespuestas()){
            System.out.println("Respuestas a la pregunta " + r.getPregunta()  +  ": " + r.getContenido());
        }
    }
    
    
    
}