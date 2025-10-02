package viveros;

import java.util.ArrayList;

public class Vivero {
    public ArrayList<Planta> plantas;
    public Vivero() {
        plantas = new ArrayList<>();
    }
    public void agregarPlanta(Planta planta) {
        plantas.add(planta);
    }
    public ArrayList<Planta> BuscarPlanta(Condicion condicion){
        ArrayList<Planta> plantasCopia = new ArrayList<>();
        for(Planta pl : plantas){
            if(condicion.cumple(pl)){
                plantasCopia.add(pl);
            }
        }
        return plantasCopia;
    }
}
