
public  class Ejercicio8 {

    public static void main (String[] args){

            Persona persona = new Persona ();
            persona.setNombre ("Raul");
            System.out.println ("El nomnbre es .. " + persona.getNombre () );
            persona.setEdad (34);
            System.out.println ("tengo :" + persona.getEdad ()  + "de edad") ;
            persona.setTelefono (920289601);
            System.out.println ("Mi telefono es:" + persona.getTelefono ());

    }
}


 class Persona {

    private static String nombre;
    private int edad;
    private int telefono;

     public void setNombre ( String nombre){
         Persona.nombre = nombre;
     }
     public String getNombre (){
         return  nombre;
     }
     public void setEdad (int edad){
         this.edad = edad;
     }
     public int getEdad(){
         return edad =edad;
     }
    public void setTelefono (int telefono){
         this.telefono = telefono;
     }
     public int getTelefono(){
         return telefono ;
     }
}

