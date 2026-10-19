public class Plato extends Producto{
    private String categoria;
    public Plato(String id, String nombre, double precio, String categoria) {
        super(id, nombre, precio);
        this.categoria = categoria;
    }
    public Plato(String id, String nombre, double precio) {
        super(id, nombre, precio);
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
