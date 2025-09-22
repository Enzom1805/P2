package plantas;
import java.util.ArrayList;

public  class Jardin {
    private ArrayList<Planta> planta;
   
    public Jardin(){
        planta = new ArrayList<Planta>();
    }

    public void AgregarPlanta(Planta pp){
        planta.add(pp);
        
    }
    public String toString() {
        StringBuilder sb = new StringBuilder("Jardin:\n");
        for(int i = 0; i < planta.size(); i++){
            sb.append(planta.get(i)).append("\n");
        }
        return sb.toString();
    }
   
  
}
