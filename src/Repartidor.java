import java.util.Objects;

public class Repartidor {
    private String id;
    private String nombre;
    private String telefono;
    private boolean disponible;
    private int entregasRealizadas;
    private double calificacion;

    public Repartidor(String id, String nombre, String telefono, int entregasRealizadas, double calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.disponible = true;
        this.entregasRealizadas = entregasRealizadas;
        this.calificacion = calificacion;
    }

    public Repartidor(String id, String nombre, String telefono) {
        this(id, nombre, telefono, 0, 5.0);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getEntregasRealizadas() {
        return entregasRealizadas;
    }

    public void setEntregasRealizadas(int entregasRealizadas) {
        this.entregasRealizadas = entregasRealizadas;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Repartidor that = (Repartidor) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return nombre + " [ID: " + id + "] - Tel: " + telefono + " (" + (disponible ? "Disponible" : "Ocupado") + ") - Entregas: " + entregasRealizadas + " - Calificación: " + calificacion;
    }
}