package Cuenta;

import java.time.LocalDate;

import Persona.Cliente;

public class CuentaDeInversion extends Cuenta {
    LocalDate fechaDeRegistro;
    int plazoSemanas;
    public CuentaDeInversion(Cliente cliente, float saldo, LocalDate fechaDeRegistro, int plazoSemanas){
        super(cliente, "02", saldo);
        this.fechaDeRegistro = fechaDeRegistro;
        this.plazoSemanas = plazoSemanas;
    }   
    @Override
    public float retirar(){
        if(fechaDeRegistro.plusWeeks(plazoSemanas).equals(LocalDate.now())){
            System.out.println("El retiro se realizó con éxito y se transfirió a tu cuenta de ahorros");  
            return saldo*(1+(0.15f/52*plazoSemanas));
        }
        else{
            System.out.println("Aún no se puede realizar su retiro de saldo. Espere a su fecha correspondiente: "
                + fechaDeRegistro.plusWeeks(plazoSemanas));
            return 0.0f;
        }
    }
    @Override
    public void visualizar() {
        System.out.println("Número de cuenta de inversión:\t" + numeroDeCuenta+ "\nTu saldo inicial fue de: "+ saldo +
        "\nCon una rentabilidad nominal del %15 anual tu retiro sería de "+ saldo*(1+(0.15f/52*plazoSemanas)) + 
        ". Retíralo después del " + fechaDeRegistro);    
    }
    
}
