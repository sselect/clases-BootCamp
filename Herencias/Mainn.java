//* Herencias;
public class Mainn {

    public static void main (String [] args){

        Cliente cliente;

        cliente = new Cliente( "Santiago ", 37, 920289601, 5000);

         System.out.println (
                        "Nombre: "
                         +cliente.getNombre () +
                         "Edad: "
                         +cliente.getEdad () +
                         "Telefono: "
                         +cliente.getTelefono () +
                         "Credito: "
                         +cliente.getCredito ());

         System.out.println ("--------------------");

        Trabajador empleado ;

        empleado = new Trabajador ("Luca ", 30, 56565656, 1.500);

        System.out.println (
                        "Nombre: "
                        +empleado.getNombre () +
                        "Edad: "
                        +empleado.getEdad () +
                        "telefono: "
                        +empleado.getTelefono () +
                        "Salario: "
                        +empleado.getSalario ()
        );

    }
}
