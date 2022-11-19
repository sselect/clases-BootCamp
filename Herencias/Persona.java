package Herencias;

public class Persona {
    private String nombre;
    private int edad;
    private int telefono;


    public  String getNombre (){
        return nombre;
    }
    public void setNombre( String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;

    }
    public long getTelefono(){
        return telefono;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
}
