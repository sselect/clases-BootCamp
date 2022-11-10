/**
 * Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
 * Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
 * También habrá que poner un default para cuando el valor de la variable no sea una estación.
 */

public class Selector_Multiple
{
    public static void main(String[] args)
    {
        String estacion = "lluvia";

        switch (estacion)
        {
            case "Invierno":
                System.out.println("Estamos en "+estacion);
                break;
            case "Verano":
                System.out.println("Estamos en "+estacion);
                break;
            case "Otoño":
                System.out.println("Estamos en "+estacion);
                break;
            case "Primavera":
                System.out.println("Estamos en "+estacion);
            default:
                System.out.println("No es una estación");
                break;
        }
    }
}
