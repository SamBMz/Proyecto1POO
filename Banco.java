import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Banco {
    int numSucursales;
    List<HashMap<String, Object>> sucursales;
    HashMap<String, Cliente> clientes;

    public Banco() {
        sucursales = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            sucursales.add(new HashMap<String, Object>());
        clientes = new HashMap<>();
    }

    public Banco(int numSucursales) {
        this.numSucursales = numSucursales;
        sucursales = new ArrayList<>();
        while (numSucursales-- > 0)
            sucursales.add(new HashMap<String, Object>());
        clientes = new HashMap<>();
    }

    public void agregarSucursal() {
        sucursales.add(new HashMap<String, Object>());
    }

    public int getNumSucursales() {
        return numSucursales;
    }

    public HashMap<String, Object> getSucursal(int indexSucursal) {
        return sucursales.get(indexSucursal);
    }

    public HashMap<String, Object> getSucursal() {
        Random rnd = new Random();
        return sucursales.get(rnd.nextInt(numSucursales));
    }

    public void mostrarSucursales() {
        for (int i = 0; i < numSucursales; i++) {
            System.out.println(i + "-Sucursal " + sucursales.get(i).get("numSucursal"));
        }
    }

    public Set<String> getNombresClientes() {
        return clientes.keySet();
    }

    public Cliente getCliente(String nombreCliente) {
        return clientes.get(nombreCliente);
    }

    public void agregarCliente(String nombreCliente) {
        clientes.put(nombreCliente, new Cliente(nombreCliente));
    }

    public void modificarCliente(String nombreCliente, String nuevoNombre) {
        Cliente cliente = clientes.get(nombreCliente);
        clientes.remove(nombreCliente);
        cliente.setNombre(nuevoNombre);
        clientes.put(nuevoNombre, cliente);
    }

    public void mostrarCliente(String nombreCliente) {
        Cliente cliente = clientes.get(nombreCliente);
        if (cliente != null) {
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println("Edad: " + cliente.getEdad());
            System.out.println("Direccion: " + cliente.getDireccion());
            System.out.println("Telefono: " + cliente.getTelefono());
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public void mostrarMenu() {
        System.out.println("\nBienvenido al menú de BBVA Bancomer 1_0_0_1");
        System.out.println("");
        System.out.println("---- Menú ----");
        System.out.println("1. Registrar Nuevo Cliente");
        System.out.println("2. Modificar datos de cliente existente");
        System.out.println("3. Ver información del cliente");
        System.out.println("4. Mostrar información de un cliente");
        System.out.println("5. Salir del programa");
        System.out.print("Seleccione una opción: ");
    }
}
