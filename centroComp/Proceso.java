package centroComp;

public class Proceso {
    private int orden;
    private int reqMemoria;
    
    public Proceso(int orden, int reqMemoria){
        this.orden = orden;
        this.reqMemoria = reqMemoria;
    }
    public int getOrden() {
        return orden;
    }
    public int getReqMemoria() {
        return reqMemoria;
    }
}
