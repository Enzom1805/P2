public class Respuesta {
    private Pregunta pregunta;
    private String contenido;

    public Respuesta(Pregunta pregunta, String contenido){
        this.pregunta = pregunta;
        this.contenido = contenido;
    }
    public String getContenido(){
        return contenido;
    }
    public Pregunta getPregunta(){
        return pregunta;
    }
}
