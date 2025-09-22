package encuestas;

import java.util.ArrayList;

public class Formulario {
    private int idFormulario;
    private String titulo;
    private String descripcion;
    private ArrayList<String> pp;
    
    public Formulario(int idFormulario, String titulo, String descripcion) {
        this.idFormulario = idFormulario;
        this.titulo = titulo;
        this.descripcion = descripcion;
        pp = new ArrayList<>();
    }
    public void agregarPregunta(String np){
        pp.add(np);
    }
   
    public String getPregunta(int pos){
        if(pos>=0&&pos<pp.size()){
            return pp.get(pos);
        }
        else{
            return null;
        }
    }
    public int getNroPregunta(){
        return pp.size();
    }
   
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdFormulario() {
        return idFormulario;
    }
    public void setIdFormulario(int idFormulario) {
        this.idFormulario = idFormulario;
    }
}
