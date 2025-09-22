package practico4;

public class AlarmaLuminosa extends Alarma{
    private Luz luzPrendida;
    public AlarmaLuminosa() {
        super();
        luzPrendida = new Luz();
    }
    @Override
    public void comprobarAlarma() {
        super.comprobarAlarma();
        if(this.getEstado1() || this.getEstado2() || this.getEstado3()){
            luzPrendida.encender();
        }else{
            System.out.println("esta todo bien");
        }
    }
}
