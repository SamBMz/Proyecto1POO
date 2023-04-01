import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class Sucursal {
    int numSucursal;
    HashMap<String, Cliente> clientes;
    Administrador admin;

    public Sucursal() {
        Random rnd = new Random();
        admin = new Administrador(this);
        numSucursal = rnd.nextInt(999) + 99;
        clientes = new HashMap<>();
        /*clientes.put("Cliente1", new Cliente("Cliente1"));
        clientes.put("Cliente2", new Cliente("Cliente2"));
        clientes.put("Cliente3", new Cliente("Cliente3"));
        clientes.put("Cliente4", new Cliente("Cliente4"));
        clientes.put("Cliente5", new Cliente("Cliente5"));*/
    }

    public Set<String> getNombresClientes() {
        return clientes.keySet();
    }

    public int getNumSucursal() {
        return numSucursal;
    }
}