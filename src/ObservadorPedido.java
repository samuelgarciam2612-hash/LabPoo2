public interface ObservadorPedido {
    void actualizar(Pedido pedido, EstadoPedido nuevoEstado);
    }