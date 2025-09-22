package prac2.tp1;

public class Episodio {
    private String titulo,descripcion;
    private int calificacion;
    private boolean seVio;

    public Episodio(String titulo, String descripcion,int calificacion, boolean seVio){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.seVio = seVio;
        if(seVio == false){
            this.calificacion = -1;
        }else{
            this.calificacion = calificacion;
        }
    }
    
    public int getCalificacion(){
        return calificacion;
    }

    public void setCalificacion(int calif){
        if(calif >= 0 || calif <= 5){
            this.calificacion = calif;
            System.out.println("Calificacion: " + calif);
        }else{
            System.out.println("La calificacion no es valida");
        }
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public boolean getSeVio(){
        return seVio;
    }
    
}
