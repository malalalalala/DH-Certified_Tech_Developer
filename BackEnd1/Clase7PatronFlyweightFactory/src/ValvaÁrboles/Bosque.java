package ValvaÁrboles;

import java.util.Random;

public class Bosque {

    private ArbolFactory fabricaArboles = new ArbolFactory();
    private final int LIMITE_ARBOLES = 1000000;

    public void plantarArboles() {
        for (int i = 0; i < LIMITE_ARBOLES; i++) {
            fabricaArboles.agregarArbol(tipoAleatorio());

        }
    }

    public void mostrarArboles() {
        fabricaArboles.mostrarArboles();
    }

    private String tipoAleatorio() {
        String[] tipos = {"ornamental", "frutal rojo", "frutal celeste"};
        Random rand = new Random();
        return tipos[rand.nextInt(3)];
    }
}
