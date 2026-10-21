import java.util.HashSet;
import java.util.Set;

public class Main {
    static void main(String[] args) {
        Cliente c1 = new Cliente("1001", "Ana Gómez", "App");
        Cliente c2 = new Cliente("1001", "Ana Gómez", "WhatsApp");
        Cliente c3 = new Cliente("1002", "Carlos Ruiz", "Telefono");
        Set<Cliente> clientes = new HashSet<>();
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        System.out.println("Total clientes registrados en Set: " + clientes.size());
        for (Cliente c : clientes) {
            System.out.println("  * " + c);
        }
        Producto plato1 = new Plato("P1", "Hamburguesa Especial", 25000.0, "Plato Fuerte");
        Producto bebida1 = new Bebida("B1", "Limonada Natural", 6000.0, 400);

        Combo comboFamiliar = new Combo("C1", "Combo Almuerzo", 0.15);
        comboFamiliar.agregarProducto(plato1);
        comboFamiliar.agregarProducto(bebida1);

        System.out.println("Plato: " + plato1);
        System.out.println("Bebida: " + bebida1);
        System.out.println("Combo: " + comboFamiliar);
        System.out.println("Precio final combo (con 15% desc): $" + comboFamiliar.getPrecio());

        comboFamiliar.getItems().clear();
        System.out.println("Items reales en combo depsues del intento de modificacion: " + comboFamiliar.getItems().size());
        Sede sedePoblado = new Sede("S1", "Sede Poblado", "Carrera 566 #45-67");
        Repartidor repartidor1 = new Repartidor("R1", "Mateo Ríos", "3119876543");

        Pedido pedido1 = new Pedido("PED-001", c1, sedePoblado);
        pedido1.setRepartidor(repartidor1);

        // Agregamos un plato individual y un combo completo (tratados como Producto)
        pedido1.agregarProducto(plato1);
        pedido1.agregarProducto(comboFamiliar);

        System.out.println(pedido1);
        System.out.println("Total a pagar del pedido: $" + pedido1.calcularTotal());
        System.out.println("Repartidor asignado: " + pedido1.getRepartidor().getNombre());
    }
}
