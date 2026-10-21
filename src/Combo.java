import java.util.ArrayList;
import java.util.List;

public class Combo extends Producto{

    private final List<Producto> items;
    private double porcentajeDescuento;

    public Combo(String id, String nombre, double porcentajeDescuento) {
        super(id, nombre, 0.0);
        this.items = new ArrayList<>();
        this.porcentajeDescuento = porcentajeDescuento;
    }
    public Combo(String id, String nombre, double precio, List<Producto> items) {
        super(id, nombre, precio);
        this.items = new ArrayList<>(items);
        this.porcentajeDescuento = 0.0;
    }
    public void agregarProducto(Producto producto) {
        if (producto != null) {
            this.items.add(producto);
        }
    }

    public List<Producto> getItems() {
        return new ArrayList<>(items);
    }
    @Override
    public double getPrecio() {
        if (this.precio > 0 && items.isEmpty()) {
            return this.precio;
        }
        double sumaTotal = items.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();

        return sumaTotal * (1.0 - porcentajeDescuento);
    }
    @Override
    public String toString() {
        return nombre + " (Combo con " + items.size() + " productos) - $" + getPrecio();
    }
}
