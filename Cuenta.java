import java.util.Random;
public abstract class Cuenta{
    protected int numeroDeCuenta;
    protected float saldo;
    public Cuenta(float saldo){
        Random rand = new Random();
        this.numeroDeCuenta = rand.nextInt(Integer.MAX_VALUE);
        this.saldo = saldo;
    }
    public Cuenta(){
        
    }
    public abstract void depositar();
    public abstract float retirar();
    public abstract void visualizar();
    
}
