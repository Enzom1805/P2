package practico4;
/*1 - Alarma
Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
sonora.
Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
encienda una luz cuando alguno de los indicadores está activado.
Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
método encender()*/
public class Alarma {
    private boolean estado1;
    private boolean estado2;
    private boolean estado3;
    private Timbre timbre;
    public Alarma() {
        estado1 = false;
        estado2 = false;
        estado3 = false;
        timbre = new Timbre();
    }
    
    public boolean getEstado1(){
        return estado1;
    }
    public boolean getEstado2(){
        return estado2;
    }
    public boolean getEstado3(){
        return estado3;
    }
    public void setEstado3(boolean estado3) {
        this.estado3 = estado3;
    }
    public void setEstado2(boolean estado2) {
        this.estado2 = estado2;
    }
    public void setEstado1(boolean estado1) {
        this.estado1 = estado1;
    }

    public void comprobarAlarma() {
        if(estado1 || estado2 || estado3) {
            timbre.hacerSonar();
        }else{
            System.out.println("Ta todo bien");
        }
    }

    public String toString() {
        return "estado1 : " + this.getEstado1() + "\nestado2 : " + this.getEstado2() 
        + "\nestado3 : " + this.getEstado3();
    }
}
