package practico4;

public class AdministradorAlarma {
    public static void main(String[] args) {
        Alarma a1 = new Alarma();
       
        AlarmaLuminosa aL1 = new AlarmaLuminosa();

        a1.setEstado1(true);
        aL1.setEstado3(true);
        a1.comprobarAlarma();
        aL1.comprobarAlarma();
        System.out.println(a1);
        System.out.println(aL1);
    }
    
}
