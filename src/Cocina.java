public class Cocina implements ObservadorPedido {

    public Cocina() {
        System.out.println("Cocina lista para recibir notificaciones");
    }

    @Override
    public void actualizar(Pedido pedido, EstadoPedido nuevoEstado) {
        if (nuevoEstado == EstadoPedido.PENDIENTE) {
            System.out.println("[COCINA] Nuevo pedido " + pedido.getId() + " por preparar");
        } else if (nuevoEstado == EstadoPedido.CANCELADO) {
            System.out.println("[COCINA] Pedido " + pedido.getId() + " cancelado, detener preparación");
        } else {
            System.out.println("[COCINA] Pedido " + pedido.getId() + " ahora está: " + nuevoEstado);
        }
    }
}