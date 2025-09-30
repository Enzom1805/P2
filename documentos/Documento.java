package documentos;
import java.util.ArrayList;
public class Documento {
    private String titulo;
    private String contenido;
    private ArrayList<String> autores;
    private ArrayList<String> pclaves;

    public Documento(String titulo, String contenido){
        this.titulo = titulo;
        this.contenido = contenido;
        autores = new ArrayList<>();
        pclaves = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }
    public String getContenido() {
        return contenido;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public void AgregarAutores(String aut){
        if(!autores.contains(aut)){
            autores.add(aut);
        }
    }
    public void AgregarPalabrasClave(String pc){
        if(!pclaves.contains(pc)){
            pclaves.add(pc);
        }
    }
    public ArrayList<String> getPalabrasClave(){
        ArrayList<String> palabrasCopia = new ArrayList<>();
        for(String pc : pclaves){
            palabrasCopia.add(pc);
        }
        return palabrasCopia;
    }
    public ArrayList<String> getAutores(){
        ArrayList<String> autCopia = new ArrayList<>();
        for(String aut : autores){
            autCopia.add(aut);
        }
        return autCopia;
    }
    public boolean esPalabra(String pal){
        return this.pclaves.contains(pal);
    }
    public boolean esAutor(String aut){
        return this.autores.contains(aut);
    }
   
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: " + getTitulo() + "\n Contenido: " + getContenido());
        for(String aut : autores){
            sb.append("\n Autor: ").append(aut);
        }
        for(String pc : pclaves){
            sb.append("\n Palabra clave: ").append(pc);
        }
        return sb.toString();
    }
}
