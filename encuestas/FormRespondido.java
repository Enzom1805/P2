package encuestas;
import java.util.ArrayList;

public class FormRespondido {
    private ArrayList<String > rr;
    private Formulario formulario;
    private Cliente cliente;
    private Empleado empleado;

    public FormRespondido(Formulario formulario, Cliente cliente, Empleado empleado) {
        rr = new ArrayList<>();
        this.formulario = formulario;
        this.cliente = cliente;
        this.empleado = empleado;
        this.empleado.realizoEncuesta();
    }
    public void agregarRespuesta(String nr){
        rr.add(nr);
    }
    public String getRespuesta(int pos){
        if(pos>=0&&pos<rr.size()){
            return rr.get(pos);
        }
        else{
            return null;
        }
    }
    public Formulario getFormulario(){
        return formulario;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public Empleado getEmpleado(){
        return empleado;
    }
   
}
