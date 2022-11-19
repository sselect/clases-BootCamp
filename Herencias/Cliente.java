//package Herencias;

public class Cliente extends Persona {

    private  int credito;

    public  Cliente (String nombre, int edad, int telefono, int credito)
    {
        setNombre (nombre);
        setEdad (edad);
        setTelefono (telefono);
        this.credito = credito;
    }
    public int getCredito(){
        return credito;
    }
    public void setCredito (int credito){
        this.credito = credito;
    }
}

