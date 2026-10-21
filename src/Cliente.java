public class Cliente implements ObservadorPedido {

    // ... atributos, constructor, equals() y hashCode() de Samuel ...

    @Override
    public void actualizar(Pedido pedido, EstadoPedido nuevoEstado) {
        System.out.println("[CLIENTE " + getNombre() + "] Tu pedido "
                + pedido.getId() + " cambió a: " + nuevoEstado);
    }
}