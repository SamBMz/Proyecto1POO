package Persona;
import java.util.Set;

import SistemaBancario.Sucursal;

public class Administrador extends Persona{
    Sucursal sucursal;
    public Set<String> clientes;
    public Administrador(String nombreCompleto, String fechaDeNacimiento, Sucursal sucursal){
        super(nombreCompleto, fechaDeNacimiento, "", 0.0f);
        this.sucursal = sucursal;
        clientes = sucursal.getNombresClientes();
    }
    public Administrador(Sucursal sucursal){
        super("Edgar Tista Garcia", "06/06/06", "Fresno, 20. Las rosas, 04350. Álvaro Obregón, CDMX", 66666.9f);
        this.sucursal = sucursal;
        clientes = sucursal.getNombresClientes();
    }
    public void mostrarClientes(){
        System.out.println("Lista de clientes: ");
        for(String nombreCliente : clientes)
            System.out.println("-"+nombreCliente);
    }
    @Override
    public void mostrarDatos() {
        
    }
    
}
