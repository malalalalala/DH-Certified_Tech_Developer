package MesasDeTrabajoÁrboles;

public class Bosque {

    private ArbolFactory fabricaArboles=new ArbolFactory();
    private final int LIMITE_ARBOLES = 1000000;

    public void plantarArboles() {
        for (int i = 0; i < LIMITE_ARBOLES/2; i++) {
            fabricaArboles.crearArbol("Ornamental");
            fabricaArboles.crearArbol("Frutal");
        }
    }


}
