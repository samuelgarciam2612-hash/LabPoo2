import modelo.Producto;
import java.util.Collection;
import java.util.Optional;

// se cumple la condicion 5 aca
public class UtilProductos {

    // solo tiene metodos static entonces no hace falta crear objetos
    private UtilProductos() { }

    // sirve con lista de platos bebidas o combos
    public static double sumarPrecios(Collection<? extends Producto> productos) {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public static Optional<Producto> masCaro(Collection<? extends Producto> productos) {
        Producto mayor = null;
        for (Producto p : productos) {
            // con el primero mayor es null y por eso se pone de una
            if (mayor == null || p.getPrecio() > mayor.getPrecio()) {
                mayor = p;
            }
        }
        // si la lista venia vacia sale vacio y no null
        return Optional.ofNullable(mayor);
    }

    public static void imprimir(Collection<? extends Producto> productos) {
        for (Producto p : productos) {
            System.out.println(p.getNombre() + " - $" + p.getPrecio());
        }
    }

    // extends porque solo leo del origen y super porque solo escribo en el destino
    public static void copiar(Collection<? extends Producto> origen,
                              Collection<? super Producto> destino) {
        for (Producto p : origen) {
            destino.add(p);
        }
    }
}