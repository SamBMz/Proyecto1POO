import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Banco {
    int numSucursales;
    List<Sucursal> sucursales;
    public Banco(){
        sucursales = new ArrayList<>();
        for(int i = 0; i < 3; i++)
            sucursales.add(new Sucursal());

    }
    public Banco(int numSucursales){
        this.numSucursales = numSucursales;
        sucursales = new ArrayList<>();
        while(numSucursales-- > 0)
            sucursales.add(new Sucursal());
    }

    public void agregarSucursal(){
        sucursales.add(new Sucursal());
    }
    public int getNumSucursales(){
        return numSucursales;
    }
    public Sucursal getSucursal(int indexSucursal){
        return sucursales.get(indexSucursal);

    }
    public Sucursal getSucursal(){
        Random rnd = new Random();
        return sucursales.get(rnd.nextInt(numSucursales));
    }
    public void mostrarSucursales(){
        for(int i = 0; i < numSucursales; i++){
            System.out.println(i + "-Sucursal " + sucursales.get(i).getNumSucursal());
        }
    }
    public void mostrarMenu(){
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
