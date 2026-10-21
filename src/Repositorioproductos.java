import modelo.Producto;

import java.util.Collection;
import java.util.Optional;

public class Repositorioproductos extends Repositorio<Producto, String> {

    // el id del producto es su id y no el nombre
    public Repositorioproductos() {
        super(Producto::getId);
    }

    // aca una wildcard asi sirve con platos bebidas o combos
    public void agregarVarios(Collection<? extends Producto> productos) {
        for (Producto p : productos) {
            guardar(p);
        }
    }

    // el nombre no es la llave del mapa entonces toca recorrer uno por uno
    public Optional<Producto> buscarPorNombre(String nombre) {
        for (Producto p : obtenerTodos()) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return Optional.of(p);
            }
        }
        return Optional.empty();
    }
}