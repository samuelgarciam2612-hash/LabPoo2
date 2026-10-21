
import modelo.Pedido;

public class Repositoriopedidos extends Repositorio<Pedido, String> {

    public Repositoriopedidos() {
        super(Pedido::getId);
    }
}