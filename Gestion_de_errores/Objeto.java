
package Gestion_de_errores;

public class Objeto {
   public static void main(String[] args){
       Coche coche = new Coche();
       System.out.println(coche.numeroDePuertas);
      // coche.acelerar();
       System.out.println(coche.velocidadMaxima);
       System.out.println(coche.velcocidadActual);

       Coche coche2 = new Coche(2,90);
       System.out.println(coche2.numeroDePuertas);
       // coche.acelerar();
       System.out.println(coche2.velocidadMaxima);
       System.out.println(coche2.velcocidadActual);
}
}
//** Estas son las propiedades **//
class Coche {
       int numeroDePuertas;
       int velocidadMaxima;
         float velcocidadActual;

       //** esto es un constructor**//
          public Coche(int puertas, int velocidad) {
                numeroDePuertas = puertas;
                velocidadMaxima = velocidad;
              System.out.println("Estoy en el constructor, con parametros");
          }
           public Coche() {
               numeroDePuertas = 5;
               velocidadMaxima = 120;
              System.out.println("Estoy en el constructor, sin parametros");
    }



    //** estos son los metodos **//
        public void  acelerar(){
            velocidadMaxima += 30;
        }
        public void decelerar(){

        }

}
