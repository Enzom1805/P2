package futbol;

import java.time.LocalDate;

public class entrenador extends integrante {
    private int idFed;

    public entrenador(String nombre, String apellido, int pasaporte, LocalDate fecha, int idFed){
        super(nombre,apellido,pasaporte,fecha);
        this.idFed = idFed;
    }
}
