import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReporteServicio {

    public List<String> obtenerTop3PlatosMasVendidos(List<Pedido> pedidos) {
        if (pedidos == null) {
            return Collections.emptyList(); // Protección inicial contra nulos
        }

        return pedidos.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getProductos() != null)
                .flatMap(pedido -> pedido.getProductos().stream())
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(Producto::getNombre, Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public Map<String, Double> obtenerFacturacionPorSede(List<Pedido> pedidos) {
        if (pedidos == null) {
            return Collections.emptyMap();
        }

        return pedidos.stream()
                .filter(Objects::nonNull)
                .filter(p -> p.getSede() != null && p.getSede().getNombre() != null)
                .collect(Collectors.groupingBy(
                        pedido -> pedido.getSede().getNombre(),
                        Collectors.summingDouble(Pedido::calcularTotal)
                ));
    }

    public Optional<Pedido> obtenerPedidoMasCaroDeCliente(List<Pedido> pedidos, String documentoCliente) {
        if (pedidos == null || documentoCliente == null) {
            return Optional.empty();
        }

        return pedidos.stream()
                .filter(Objects::nonNull)
                .filter(pedido -> pedido.getCliente() != null &&
                        documentoCliente.equals(pedido.getCliente().getDocumento()))
                .max(Comparator.comparing(Pedido::calcularTotal));
    }
}