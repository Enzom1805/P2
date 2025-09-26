package Barco;
import java.util.ArrayList;
public class Puerto {
    private ArrayList<Barco> barcos;
    private ArrayList<Camion> camiones;

    public Puerto(){
        this.barcos = new ArrayList<Barco>();
        this.camiones = new ArrayList<Camion>();
    }
    public void agregarCamion(Camion cc){
        int i = 0;
        while(i < camiones.size() && camiones.get(i).getFechaCarga().isBefore(cc.getFechaCarga())){
            i++;
        }
        camiones.add(i, cc);
    }
    public void agregarBarco(Barco bb){
        int i = 0;
        while(i < barcos.size() && barcos.get(i).getCapacidad() >= bb.getCapacidad()){
            i++;
        }
        barcos.add(i,bb);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" --Camiones-- \n");
        for(Camion cc : camiones){
            sb.append(" Numero camion ").append(cc.getNumeroCamion())
            .append(" Fecha carga ").append(cc.getFechaCarga()).append("\n");
        }
        sb.append(" --Barcos-- \n");
        for(Barco bb : barcos){
            sb.append(" Numero barco " ).append(bb.getNumeroBarco())
            .append(" Capacidad ").append(bb.getCapacidad()).append("\n");
        }
        return sb.toString();
    }
}
