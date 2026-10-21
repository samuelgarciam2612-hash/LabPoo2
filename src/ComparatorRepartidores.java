import java.util.Comparator;

public class ComparatorRepartidores implements Comparator<Repartidor> {

    private static final Comparator<Repartidor> REGLA =
            Comparator.comparing(Repartidor::getCalificacion, Comparator.nullsLast(Comparator.naturalOrder())).reversed()
                    .thenComparing(Comparator.comparing(Repartidor::getEntregasRealizadas, Comparator.nullsLast(Comparator.naturalOrder())).reversed());

    @Override
    public int compare(Repartidor r1, Repartidor r2) {
        if (r1 == null && r2 == null) return 0;
        if (r1 == null) return 1;
        if (r2 == null) return -1;
        return REGLA.compare(r1, r2);
    }
}
