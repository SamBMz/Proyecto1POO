package Persona;
public abstract class Persona{
    protected float ingresos;
    protected final String[] nombreCompleto;
    protected final String[] fechaNacimiento;
    protected String[] domicilio;
    protected Persona(String nombreCompleto, String fechaNacimiento, String domicilio, float ingresos){
        this.nombreCompleto = nombreCompleto.split(" ");
        this.fechaNacimiento = fechaNacimiento.split("/");
        this.domicilio = domicilio.split(" ");
        this.ingresos = ingresos;
    }
    protected Persona(String nombreCompleto){
        this.nombreCompleto = nombreCompleto.split(" ");
        fechaNacimiento = null;
    }
    public String getNombreCompleto(){
        String nombreCompleto = "";
        for(String str : this.nombreCompleto)
            nombreCompleto += str + " ";
        return nombreCompleto;
    }
    public String[] getFechaNacimiento(){
        return fechaNacimiento;
    }
    public void setDomicilio(String domicilio){
        
        this.domicilio = domicilio.split(" ");
    }
    public abstract void mostrarDatos();

}
