public class Repartidor implements ObservadorPedido {

    // ... atributos y constructor de Samuel ...

    @Override
    public void actualizar(Pedido pedido, EstadoPedido nuevoEstado) {
        if (nuevoEstado == EstadoPedido.EN_PREPARACION) {
            System.out.println("[REPARTIDOR " + getNombre() + "] Pedido "
                    + pedido.getId() + " en preparación, prepárate para recogerlo");
        } else {
            System.out.println("[REPARTIDOR " + getNombre() + "] Pedido "
                    + pedido.getId() + " ahora está: " + nuevoEstado);
        }
    }
    }