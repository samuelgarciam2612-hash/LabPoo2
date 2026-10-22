import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pedido {
    private String id;
    private Cliente cliente;
    private final List<Producto> productos;
    private Sede sede;
    private Repartidor repartidor;
    private String estado;

    public Pedido(String id, Cliente cliente, Sede sede) {
        this.id = id;
        this.cliente = cliente;
        this.sede = sede;
        this.productos = new ArrayList<>();
        this.estado = "PENDIENTE";
    }

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            this.productos.add(producto);
        }
    }

    public double calcularTotal() {
        return productos.stream()
                .mapToDouble(Producto::getPrecio)
                .sum();
    }

    public List<Producto> getProductos() {
        return new ArrayList<>(productos);
    }

    public String getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Sede getSede() {
        return sede;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public void setRepartidor(Repartidor repartidor) {
        this.repartidor = repartidor;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(id, pedido.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Pedido #" + id + " - Cliente: " + cliente.getNombre() +
                " - Items: " + productos.size() +
                " - Total: $" + calcularTotal() +
                " - Estado: " + estado;
    }
}
