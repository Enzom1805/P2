package documentos;
import java.util.ArrayList;
public class Buscador {
    private ArrayList<Documento> documentos;

    public Buscador(){
        documentos = new ArrayList<>();
    }
    public void agregarDocumento(Documento doc){
        documentos.add(doc);
    }
    public ArrayList<Documento> BuscarDocumento(Condicion condicion){
        ArrayList<Documento> resultados = new ArrayList<>();
        for(Documento doc : documentos){
            if(condicion.cumple(doc)){
                resultados.add(doc);
            }
        }
        return resultados;
    }
}
