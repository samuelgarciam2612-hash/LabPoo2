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
    }
}
