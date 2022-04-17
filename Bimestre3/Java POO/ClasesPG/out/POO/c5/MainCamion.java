package c5;

public class MainCamion {

    public  static void main(String[] args) {
        Camion miCamion = new Camion("Ford", "AV XX CD");
        Camion.cambiarPrecioCombustible(98.5);
        System.out.println("Gasto " +miCamion.gastoCombustible(40));
    }

}
