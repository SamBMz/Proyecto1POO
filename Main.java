import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner stdin = new Scanner(System.in);
        int opc;

        System.out.println("Bienvenido al banco, a continuación se muestran nuestras sucursales:");
        banco.mostrarSucursales();

        System.out.println("1. Iniciar sesión como cliente \n2. Nuevo cliente \n3. Iniciar sesión como administrador \nIngrese 0 para salir...");
        opc = stdin.nextInt();
        stdin.nextLine();
        do {
            switch(opc = stdin.nextInt()){
                case 1: //CLiente 
                    System.out.println("Ingrese su nombre completo:");
                    String nombreCLiente = stdin.nextLine();
                    if (banco.getNombresClientes().contains(nombreCLiente)) {
                        System.out.println("Bienvenido " + nombreCLiente);
                        System.out.println("Cuentas: ");
                        Cliente cliente = banco.getCliente(nombreCLiente);
                        cliente.imprimeSaldo(); //debe imprimir el saldo de las cuentas de ahorro y de inversion sin detalles
                        do {
                            System.out.println("1. Ver cuenta \n2. Nueva cuenta \n3. Ver detalles del cliente \nIngrese 0 para salir...");
                            int opt2 = stdin.nextInt();
                            stdin.nextLine();
                            switch (opt2) {
                                case 1: //Ver cuenta
                                    System.out.println("Ingrese el número de cuenta que desea ver:");
                                    int noCuenta = stdin.nextInt();
                                    cliente.buscarCuenta(noCuenta).visualizar(); //Busca la cuenta específicada con todos sus detalles y la imprime
                                    System.out.println("1. Depositar \n2. Retirar");
                                    int opt3 = stdin.nextInt();
                                    switch (opt3) {
                                        case 1:
                                            System.out.println("¿Cuánto desea depositar?");
                                            float deposito = stdin.nextFloat();
                                            stdin.nextLine();
                                            cliente.buscarCuenta(noCuenta).depositar(deposito);
                                            stdin.nextLine();
                                            break;
                                        case 2:
                                            System.out.println("¿Cuánto desea retirar?");
                                            float retiro = stdin.nextFloat();
                                            stdin.nextLine(); 
                                            cliente.buscarCuenta().retirar(retiro);
                                            stdin.nextLine();
                                            break;
                                        default:
                                            System.out.println("Opción Inválida.");
                                            break;
                                    }
                                    break;
                                case 2: //Nueva cuenta
                                    System.out.println("¿Qué tipo de cuenta se abrirá? \n1. Ahorro \n2. Inversión");
                                    int tipoCuenta = stdin.nextInt();
                                    stdin.nextLine();
                                    switch (tipoCuenta) {
                                        case 1: //ahorro
                                            cliente.addCuentaAhorro(); //Pide los datos de la nueva cuenta y la añade a la lista de cuentas
                                            break;
                                        case 2: //inversion
                                            cliente.addCuentaInversion(); //Pide los datos de la nueva cuenta y la añade a la lista de cuentas
                                        default:
                                            break;
                                    }
                                    break;
                                case 3: //Detalles de cliente
                                    cliente.imprimirClienteCompleto();
                                    break;
                                case 0: //salir
                                    break;
                                default:
                                    break;
                            }
                        } while (opt2!=0);
                        opc = 0;
                    } else {
                        System.out.println("No se encontró el cliente.");
                    }
                    break;
                case 2: //Nuevo cliente 
                    System.out.println("Ingrese su nombre completo:");
                    String nuevoCliente = stdin.nextLine();
                    System.out.println("Ingrese su fecha de nacimiento:"); 
                    String fechaNac = stdin.nextLine();
                    System.out.println("Ingrese su domicilio:");
                    String domicilio = stdin.nextLine();
                    System.out.println("¿Cuál es su ingreso mensual?");
                    float ingresos = stdin.nextFloat();
                    stdin.nextLine();
                    banco.agregarCliente(nuevoCliente,fechaNac,domicilio,ingresos);
                    break;
                case 3: //Admin
                    System.out.println("Ingrese su numero de sucursal:");
                    int numSucursal = stdin.nextInt();
                    stdin.nextLine();
                    System.out.println("Ingrese su nombre:");
                    String nombreAdmin = stdin.nextLine();
                    if (banco.getSucursal(numSucursal).containsKey(nombreAdmin)) {
                        System.out.println("Bienvenido " + nombreAdmin);
                        System.out.println("1. Ver clientes de la sucursal \nIngrese 0 para salir...");
                        int opt4 = stdin.nextInt();
                        stdin.nextLine();
                        switch (opt4) {
                            case 1:
                                banco.getSucursal(numSucursal).getAdmin(nombreAdmin).mostrarClientes();
                                break;
                        
                            default:
                                break;
                        }
                    } else {
                        System.out.println("No se encontró el administrador.");
                    }
                    break;
                case 0: //Salir
                    break;
                default: //inválido
                    System.out.println("Opción inválida.");
            } 
        } while (opc!=0);
        System.out.println("Hasta luego! ^^");
    }
}
