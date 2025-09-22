package alquileres;
import java.time.LocalDate;
import java.util.ArrayList;
public class Alquiler {
    private Cliente cliente;
    private ItemAlquilable item;
    private ArrayList<ItemAlquilable> itemsDisponibles;
    private LocalDate fechaVencimiento;

    public Alquiler(Cliente cliente, ItemAlquilable item, LocalDate fechaVencimiento){
        this.cliente = cliente;
        this.item = item;
        this.fechaVencimiento = fechaVencimiento;
        this.itemsDisponibles = new ArrayList<ItemAlquilable>();
        cliente.agregarAlquiler(this);
        item.registrarAlquiler(cliente);
    }
    public Cliente getCliente() {
        return cliente;
    }
    public ItemAlquilable getItem() {
        return item;
    }
    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }
    public ArrayList<ItemAlquilable> gItemsDisponibles(){
        return itemsDisponibles;
    }
    public boolean estaVencido(){
        return LocalDate.now().isAfter(fechaVencimiento);
    }
    @Override
    public String toString(){
        return "Alquiler de " + getItem() +
               " | Cliente: " + cliente.getNombre() +
               " | Vence: " + getFechaVencimiento() +
               (estaVencido() ? " (VENCIDO)" : "");
    }
 }


