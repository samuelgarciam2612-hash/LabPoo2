public class Bebida extends Producto {
    private int volumenMl;

    public Bebida(String id, String nombre, double precio, int volumenMl) {
        super(id, nombre, precio);
        this.volumenMl = volumenMl;
    }

    public Bebida(String id, String nombre, double precio) {
        super(id, nombre, precio);
    }
    public int getVolumenMl() {
        return volumenMl;
    }

    public void setVolumenMl(int volumenMl) {
        this.volumenMl = volumenMl;
    }
}
