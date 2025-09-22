import java.util.ArrayList;
public class encuestaFormulario extends empresa{
    
    private ArrayList<> preguntas;
    private int numPregunta;

    public encuestaFormulario(int numPregunta){
        this.preguntas = new ArrayList<>();
        this.numPregunta = numPregunta;
    }
    public void agregarPreguntas(String enunciado){
        Pregunta p = new Pregunta(numPregunta++, enunciado);
        preguntas.add(p);
    }
    public ArrayList<Pregunta> getPreguntas(){
        return preguntas;
    }
    public int getNumeroPregunta(){
        return numPregunta;
    }
    public void mostrarPreguntas(){
        for(Pregunta p : getPreguntas())
            System.out.println("Pregunta numero " + p.getNumeroPregunta() + ": " + p.getEnunciado());
    }
}
