//package Herencias;

public class Trabajador extends Persona{

     private double salario;

     public Trabajador(String nombre, int edad, int telefono, double salario )

     {
         setEdad (edad);
         setNombre (nombre);
         setTelefono (telefono);
     }
     public double getSalario(){
         return salario;
     }
     public void setSalario (float salario){
         this.salario = salario;
     }
}
