import java.util.Comparator;

public class ComparatorMenu implements Comparator<Producto> {

    private static final Comparator<Producto> REGLA =
            Comparator.comparing(Producto::getPrecio, Comparator.nullsLast(Comparator.naturalOrder())).reversed()
                    .thenComparing(Producto::getNombre, Comparator.nullsLast(Comparator.naturalOrder()));

    @Override
    public int compare(Producto p1, Producto p2) {
        if (p1 == null && p2 == null) return 0;
        if (p1 == null) return 1;
        if (p2 == null) return -1;
        return REGLA.compare(p1, p2);
    }
}
