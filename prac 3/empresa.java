public class empresa {
    public static void main(String[] args) {
        encuestaFormulario f1 = new encuestaFormulario(1);
        encuestaRespondida r1 = new encuestaRespondida(, null, f1)

        f1.agregarPreguntas("Como estas?");
        f1.agregarPreguntas("Quien sos?");
        
        f1.mostrarPreguntas();
    }
}
