Juan Antonio: Patrones de Diseño
Strategy (EstrategiaPromocion, SinPromocion, DescuentoPorcentaje, DescuentoFijo): Pedido calcula el total con la interfaz, así se agregan promociones sin modificarlo.
Observer (ObservadorPedido, Cocina, Cliente, Repartidor): Pedido avisa a todos sus observadores al cambiar de estado (EstadoPedido).
Factory (ProductoFactory): crea Plato, Bebida y Combo con un Map en lugar de if-else.
SOLID: Abierto/Cerrado y Inversión de Dependencias (Pedido depende de interfaces).
Funcional: mapToDouble en el subtotal y referencias a constructores en la fábrica.