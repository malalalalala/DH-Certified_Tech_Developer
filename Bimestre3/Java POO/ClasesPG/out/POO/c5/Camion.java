package c5;

public class Camion {
    private String marca;
    private String patente;
    //variable de clase
//    Definimos la variable como static, esto hace que no se pueda usar con un objeto.
    static private double valorCombustible;

    public Camion(String marca,String patente){
        this.marca=marca;
        this.patente=patente;
    }

    public double gastoCombustible(int litros){
        return litros*Camion.valorCombustible;
    }

//    Definimos el método como static, esto hace que no se pueda usar con un objeto.
    static public void cambiarPrecioCombustible(double precio){
        Camion.valorCombustible=precio;
    }

}
