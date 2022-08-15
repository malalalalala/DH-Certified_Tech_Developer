package ClaseAsincrónicaCancionesJuanCarlos;

public class Main {
    public static void main(String[] args) {
        //final CancionFactory cancionFactory = new CancionFactory();

        final CancionFactory cancionFactory = new CancionFactory();





        Cancion cancion = cancionFactory.validarCancion("Sin medir distancia");
        Cancion cancion1 = cancionFactory.validarCancion("La creciente");
        Cancion cancion2 = cancionFactory.validarCancion("Señora");
        Cancion cancion3 = cancionFactory.validarCancion("Los caminos de la vida");
        Cancion cancion4 = cancionFactory.validarCancion("Mi diosa humana");
        Cancion cancion5 = cancionFactory.validarCancion("Quiero que seas mi estrella");
        Cancion cancion6 = cancionFactory.validarCancion("Sin medir distancia");
        Cancion cancion7 = cancionFactory.validarCancion("nunca niegues que te amo");

        System.out.println(cancionFactory.getListar());









    }
}
