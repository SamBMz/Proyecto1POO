package Cuenta;
import java.util.Random;
import Persona.Cliente;
public abstract class Cuenta{
    protected Cliente cliente;
    protected String numeroDeCuenta;
    protected float saldo;
    protected Cuenta(Cliente cliente, String tipoCuenta, float saldo){
        Random rand = new Random();
        numeroDeCuenta = ""+ cliente.getSucursal() + rand.nextInt(10000) + tipoCuenta + cliente.getFechaNacimiento()[2];
        this.saldo = saldo;
        this.cliente = cliente;
    }
    public abstract float retirar();
    public abstract void visualizar();
}
