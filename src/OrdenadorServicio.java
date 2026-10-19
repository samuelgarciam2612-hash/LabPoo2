import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class OrdenadorServicio {

    private final ComparatorMenu comparatorMenu = new ComparatorMenu();
    private final ComparatorRepartidores comparatorRepartidores = new ComparatorRepartidores();

    public List<Producto> ordenarMenu(List<Producto> productos) {
        if (productos == null) {
            return Collections.emptyList(); // Blindaje estricto por la Condición 7
        }
        return productos.stream()
                .filter(Objects::nonNull) // Elimina elementos nulos internos por seguridad
                .sorted(comparatorMenu)   // Aplica tu comparador personalizado
                .collect(Collectors.toList());
    }

    public List<Repartidor> ordenarRepartidores(List<Repartidor> repartidores) {
        if (repartidores == null) {
            return Collections.emptyList(); // Blindaje estricto por la Condición 7
        }
        return repartidores.stream()
                .filter(Objects::nonNull) // Elimina elementos nulos internos por seguridad
                .sorted(comparatorRepartidores) // Aplica tu comparador de repartidores
                .collect(Collectors.toList());
    }
}
