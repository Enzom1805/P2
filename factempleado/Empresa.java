package factempleado;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;
    

    public Empresa(){
        empleados = new ArrayList<Empleado>();
        
    }
    public void agregarEmpleado(Empleado ee){
        empleados.add(ee);
    }
    public double totalSueldos() {
        double total = 0;
        for (Empleado e : empleados) {
            total += e.getSueldoB(); 
        }
        return total;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Empleado p : empleados){
            sb.append(p).append("\n");
            
        }
        return sb.toString();
    }
}
