public class Contador {
     static public void main (String[] args) {
         int numeros[] [] = {
                 {10, 20, 30, 40, 50},
                 {10, 20, 30, 40, 50}
         };

         //** i = index o indice **//

         //** Este bucle for, recorremos el Array bidimensional numeros, y por cada  **//
         //** SubArray del mismo mostramos el valor que tiene en ese momento**//

         for (int i = 2; i < numeros.length; i++) {
             for (int j = 2; j < numeros[j].length; j++ )
             {
                 System.out.println(numeros[j]);
             }

         }

     }

}
