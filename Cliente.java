package Persona;
import java.util.ArrayList;

import Cuenta.Cuenta;

public class Cliente extends Persona {
    private int numSucursal;
    private ArrayList<Cuenta> cuentas;
    public Cliente(String nombreCliente, String fechaNacimiento, String domicilio, float ingresos) {
        super(nombreCliente, fechaNacimiento, domicilio, ingresos);
    }   
    public Cliente(String nombreCliente){
        super(nombreCliente);
    }
    public void setSucursal(int numSucursal){
        this.numSucursal = numSucursal;
    }
    public int getSucursal(){
        return numSucursal;
    }
    public void mostrarCuentas(){
        for(Cuenta cuenta : cuentas)
            cuenta.visualizar();
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Nombre del cliente: " +super.getNombreCompleto()+"\tSucursal: "+ numSucursal +"\nCuentas: ");
        mostrarCuentas();
    }
    public Cuenta getCuenta(){
        return null;
    }    
}
