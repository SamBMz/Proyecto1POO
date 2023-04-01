package Cuenta;

import Persona.Cliente;

public class CuentaDeAhorro extends Cuenta{

    public CuentaDeAhorro(Cliente cliente, float saldo){
        super(cliente, "01 ",  saldo);
    }
    public CuentaDeAhorro(Cliente cliente){
        super(cliente, "01", 0.0f);
    }
    public void depositar(float deposito) {
        if(deposito > 0){
            saldo += deposito;
            System.out.println("Se realizó con éxito tu depósito");
        }
        else
            System.out.println("No se pudo realizar tu deposito");
    }
    @Override
    public float retirar(){
        float retiro = saldo - saldo % 50;
        saldo -= retiro;
        System.out.println("Se realizó con éxito el retiro");
        return retiro;
    }
    public float retirar(float retiro){
        if(retiro % 50 == 0.0 && retiro >= 50){
            saldo -= retiro;
            System.out.println("Toma tu efectivo de $"+retiro);
            return retiro;
        }
        System.out.println("No se pudo realizar tu retiro de efectivo");
        return 0.0f;
    }
    @Override
    public void visualizar() {
        System.out.println("Numero de cuenta de ahorro:\t" + numeroDeCuenta+"\nTu saldo es de:\t" + saldo+ 
            "\n1.Realizar Deposito\n2.Realizar Retiro\n3.Salir");
    }
    
    
}
