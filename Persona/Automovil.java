public class Automovil {

    public static void main (String [] args){
        Auto carro = new Auto ();
        carro.setMarca ("Chevrolet");
        System.out.println ("la marca de este auto es:" +carro.getMarca ());
        carro.setModelo ("All New Terrotory");
        System.out.println ("es un modelo " +carro.getModelo ());
        carro.setNumeroPuertas (6);
        System.out.println ( "puertas" +carro.getNumeropuertas ());
        carro.setYear (2023);
        System.out.println (carro.getYear ());
        carro.setPrecio (220000000);
        System.out.println ("Es su valor" +carro.getPrecio ());
    }


}


class  Auto {

    private static String marca;
    private static String modelo;
    private int numeropuertas;
    private int year;
    private int precio;

    public void setMarca (String marca){
        Auto.marca = marca;
    }
        public  String getMarca(){
         return marca;
        }
    public void setModelo (String modelo){
        Auto.modelo = modelo;
    }
        public String getModelo (){
         return modelo;
        }
    public void setNumeroPuertas(int numeropuertas){
         this.numeropuertas = numeropuertas;
    }
         public int getNumeropuertas () {
          return numeropuertas;
        }
    public void setYear (int year){
        this.year = year;
    }
        public int getYear(){
        return year;
        }
    public void setPrecio (int precio){
        this.precio = precio;
    }
        public int getPrecio(){
         return precio;
        }
}