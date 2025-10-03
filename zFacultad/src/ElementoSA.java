import java.time.LocalDate;

public abstract class ElementoSA {

    private String nombre;  //get y set
    private LocalDate fechaCreacion;

    public ElementoSA(String nombre) {
        this.nombre = nombre;
        this.fechaCreacion = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public abstract double getTamanio();
    public abstract int cantElementos();
    @Override
    public boolean equals(Object o) {
        try{
            ElementoSA otroElemento =  (ElementoSA)o;
            return otroElemento.getNombre().equals(this.getNombre());
        } catch (ClassCastException e){
            return false;
        }
    }
}
