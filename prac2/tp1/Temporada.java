package prac2.tp1;

import java.util.ArrayList;
    public class Temporada {
    private ArrayList<Episodio> episodios;
    private int cantEpisodios;

    public Temporada(int cantEpisodios){
        this.cantEpisodios = cantEpisodios;
    }
    
    
    public void agregarEpisodios(Episodio episodios){
        this.episodios.add(episodios);
    }
    public int getCantidadEpisodiosVistosPorTemporada(){
        int vistos = 0;
        for(Episodio e : episodios ){
            if(e.getSeVio() == true){
                vistos++;
            }
        }
        return vistos;
    }
    public void getPromedioCalif(){
        double promedio = 0.0;
        int contador = 0;
        int cantidad = 0;
        for(Episodio e : episodios){
            contador += e.getCalificacion();
            cantidad++;
        }
        promedio = (double)(contador / cantidad);
        System.out.println("promedio de calificacion por temporada: " + promedio);
    }
    public int getCantEpisodios(){
        return cantEpisodios;
    }
}
