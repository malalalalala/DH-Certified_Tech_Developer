package c7;

public class Televisor {
    private String marca;
    private Pantalla pantalla;

    public  Televisor(){
        pantalla=new Pantalla();
    }

    private class Pantalla{
        private int pulgadas;
    }
}
