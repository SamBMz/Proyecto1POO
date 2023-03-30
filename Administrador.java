import java.util.Set;

public class Administrador extends Persona{
    Sucursal sucursal;
    public Set<String> clientes;
    public Administrador(Sucursal sucursal){
        this.sucursal = sucursal;
        clientes = sucursal.getNombresClientes();
    }
    public void mostrarClientes(){
        System.out.println("Lista de clientes: ");
        for(String nombreCliente : clientes)
            System.out.println("-"+nombreCliente);
    }
    
}
