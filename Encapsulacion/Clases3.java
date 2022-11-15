
public class Clases3{

    public static void main (String [] args){
        Vehiculo coche = new Vehiculo();
        coche.setTipo ("Coupe");
        coche.setVelocidadMaxima (120);

        Vehiculo moto = new Vehiculo();
        moto.setTipo ("Scooter");
        moto.setVelocidadMaxima (50);

            System.out.println(coche.getTipo());
            System.out.println(coche.getVelocidadMaxima());
            System.out.println(moto.getTipo() + " " + moto.getVelocidadMaxima());

    }
}

class Vehiculo {
    private String tipo;
    private int velocidadMaxima;
    private int estado;

    public void setVelocidadMaxima (int velocidadMaxima){
        this.velocidadMaxima = velocidadMaxima;
     }
        public int getVelocidadMaxima(){
        return this.velocidadMaxima;
        }
                 public void setTipo (String tipo){
                    if (this.estado == 0 ) {
                     this.tipo = tipo;
        }
     }
                public String getTipo (){
                    return this.tipo;
    }
}