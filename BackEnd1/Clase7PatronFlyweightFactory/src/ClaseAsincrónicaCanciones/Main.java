package ClaseAsincrónicaCanciones;

public class Main {

    private static final String canciones[]={"blabla","lqla","hujio","sdhljksaf","shdhsa"};

    private static String cancionAleatoria() {
        return canciones[(int)(Math.random()* canciones.length)];
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            Cancion cancion= CancionFactory.validarCancion(cancionAleatoria());
            cancion.setArtista("laura");
            cancion.setGenero("Rock");

        }
    }



}
