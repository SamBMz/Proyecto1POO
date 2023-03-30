import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Hashtable;

public class Cliente extends Persona {
    Sucursal sucursal;
    ArrayList<Cuenta> cuentas;
    public Cliente(String nombre, String apellidoPaterno, int id, int fechaNacimiento) {
        this.nombre = nombre;
        this.apPaterno = apellidoPaterno;
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
    }   
    public void mostrarCuentas(){
        for(Cuenta cuenta : cuentas)
            cuenta.visualizar();
    }
    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void registrarPersona(Hashtable<Integer, Cliente> personaHashtable) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del nuevo cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido paterno del nuevo cliente: ");
        String apellidoPaterno = scanner.nextLine();
        System.out.print("Ingrese la fecha de nacimiento del nuevo cliente (formato AAAAMMDD): ");
        int fechaNacimiento= scanner.nextInt();
        Random rand = new Random();
        int id = rand.nextInt(9000)+1000; // genera un número entre 0 y 9999
        System.out.println("Su ID sea registrado , por favor no la olvide es:  " + id);
        
        Cliente nuevaPersona = new Cliente(nombre, apellidoPaterno, id, fechaNacimiento);
        personaHashtable.put(nuevaPersona.getId(), nuevaPersona);
    }
    
    public void imprimirDatos(Hashtable<Integer, Cliente> clienteHashtable) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del cliente que desea buscar: ");                
        int idBuscar = scanner.nextInt();
        Cliente personaBuscada = clienteHashtable.get(idBuscar);
        if (personaBuscada != null) {
            System.out.println("Información del cliente:");
            System.out.println("ID: " + personaBuscada.getId());
            System.out.println("Nombre: " + personaBuscada.getNombre() + " " + personaBuscada.getApPaterno());
            System.out.println("Fecha de nacimiento: " + personaBuscada.getFechaNacimiento());
        } else {
            System.out.println("No se encontró un cliente con ese ID.");
        }

           /*public void imprimirclientecompleto(){
        //Imprimira datos y cuentas 
    } */
    
  

  /*   public void imprimesaldo(){
        //solo imprime saldo de las cuentas de ahorro solamente
        
    }*/
    
    }
}