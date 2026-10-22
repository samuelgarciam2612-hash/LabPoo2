import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Repositorioclientes extends Repositorio<Cliente, String> {

    // el set no deja repetidos y compara por documento
    private final Set<Cliente> clientes = new HashSet<>();

    // el id del cliente es su documento
    public Repositorioclientes() {
        super(Cliente::getDocumento);
    }

    // true si era nuevo y false si ya estaba ese documento
    public boolean registrar(Cliente cliente) {
        boolean esNuevo = clientes.add(cliente);
        if (esNuevo) {
            // si es nuevo tambien va al mapa para buscarlo rapido
            guardar(cliente);
        }
        return esNuevo;
    }

    public Optional<Cliente> buscarPorDocumento(String documento) {
        return buscarPorId(documento);
    }
}