import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

// clase generica para no repetir codigo en cada repositorio
// es una de las condiciones q estaba
public class Repositorio<T, K> {

    // por aqui se guarda todo y la llave es el id
    private final Map<K, T> datos = new HashMap<>();

    // dice como sacar el id de cada objeto
    private final Function<T, K> extractorId;

    public Repositorio(Function<T, K> extractorId) {
        this.extractorId = extractorId;
    }

    // saca el id con la funcion y lo mete al mapa
    // si ya estaba lo reemplaza
    public void guardar(T elemento) {
        datos.put(extractorId.apply(elemento), elemento);
    }

    // si no lo encuentra devuelve vacio y no null
    public Optional<T> buscarPorId(K id) {
        return Optional.ofNullable(datos.get(id));
    }

    public boolean existe(K id) {
        return datos.containsKey(id);
    }

    // remove devuelve lo que borro entonces si no es null si estaba
    public boolean eliminar(K id) {
        return datos.remove(id) != null;
    }

    // copia para que no toquen el mapa original
    public List<T> obtenerTodos() {
        return new ArrayList<>(datos.values());
    }

    public int cantidad() {
        return datos.size();
    }
}