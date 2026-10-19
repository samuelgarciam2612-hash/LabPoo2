import java.util.Objects;

public class Cliente {
    private String documento;
    private String nombre;
    private String canalRegistro;

    public Cliente(String documento, String nombre, String canalRegistro) {
        this.documento = documento;
        this.nombre = nombre;
        this.canalRegistro = canalRegistro;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCanalRegistro() {
        return canalRegistro;
    }

    public void setCanalRegistro(String canalRegistro) {
        this.canalRegistro = canalRegistro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(documento, cliente.documento);
    }
    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }
    @Override
    public String toString() {
        return nombre + " [Doc: " + documento + "] (Canal: " + canalRegistro + ")";
    }

}
