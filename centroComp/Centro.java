package centroComp;
import java.util.ArrayList;
public class Centro {
    private ArrayList<Computadora> computadoras;
    private ArrayList<Proceso> procesos;
    
    public Centro(){
        this.computadoras = new ArrayList<Computadora>();
        this.procesos = new ArrayList<Proceso>();
    }
    public void agregarProceso(Proceso pp) {
		int i = 0;
        while(i < procesos.size() && procesos.get(i).getReqMemoria() >= pp.getReqMemoria()){
            i++;
        }
        procesos.add(i,pp);
	}
    public void agregarComputadora(Computadora c) {
        int i = 0;
        while (i < computadoras.size() && computadoras.get(i).getVelocidad() >= c.getVelocidad()) {
            i++;
        }
        computadoras.add(i, c);
    }
    
    public Proceso obtenerSiguienteProceso(){
        if(!procesos.isEmpty()){
            return procesos.remove(0);
        }
        return null;
    }
    public Computadora obtenerComputadoraDisponible(){
        for(Computadora c : computadoras){
            if(c.getDisponible()){
                return c;
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Procesos: \n");
        for(Proceso p : procesos){
            sb.append(" Orden: ").append(p.getOrden())
            .append(" Memoria: ").append(p.getReqMemoria())
            .append("\n");
        
        }
        sb.append("\nComputadoras: \n");
        for(Computadora c : computadoras){
            sb.append("  Nro: ").append(c.getNumero())
          .append(" | Velocidad: ").append(c.getVelocidad())
          .append(" | Disponible: ").append(c.getDisponible()).append("\n");

        }
        return sb.toString();
    }
}
