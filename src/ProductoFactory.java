import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductoFactory {

    @FunctionalInterface
    private interface Creador {
        Producto crear(String id, String nombre, double precio);
    }

    private static final Map<String, Creador> creadores = new HashMap<>();

    static {
        creadores.put("PLATO", Plato::new);
        creadores.put("BEBIDA", Bebida::new);
    }

    public static Producto crear(String tipo, String id, String nombre, double precio) {
        Creador creador = creadores.get(tipo.toUpperCase());
        if (creador == null) {
            throw new IllegalArgumentException("Tipo de producto desconocido: " + tipo);
        }
        return creador.crear(id, nombre, precio);
    }

    public static Producto crearCombo(String id, String nombre, List<Producto> productos) {
        return new Combo(id, nombre, productos);
    }
    }