import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

public class Banco {
    int numSucursales;
    List<HashMap<String, Object>> sucursales; // Cambio de Sucursal a HashMap<String, Object>

    public Banco() {
        sucursales = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            sucursales.add(new HashMap<String, Object>()); // Crear HashMap vacío
    }

    public Banco(int numSucursales) {
        this.numSucursales = numSucursales;
        sucursales = new ArrayList<>();
        while (numSucursales-- > 0)
            sucursales.add(new HashMap<String, Object>()); // Crear HashMap vacío
    }

    public void agregarSucursal() {
        sucursales.add(new HashMap<String, Object>()); // Crear HashMap vacío
    }

    public int getNumSucursales() {
        return numSucursales;
    }

    public HashMap<String, Object> getSucursal(int indexSucursal) { // Cambio de Sucursal a HashMap<String, Object>
        return sucursales.get(indexSucursal);
    }

    public HashMap<String, Object> getSucursal() { // Cambio de Sucursal a HashMap<String, Object>
        Random rnd = new Random();
        return sucursales.get(rnd.nextInt(numSucursales));
    }

    public void mostrarSucursales() {
        for (int i = 0; i < numSucursales; i++) {
            System.out.println(i + "-Sucursal " + sucursales.get(i).get("numSucursal")); // Obtener el valor de la clave "numSucursal" del HashMap
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
