import MiResolucion.Sediento;

public class Hambriento implements TamagachiState {
    @Override
    public TamagachiState darDeBeber() {
        return this;
    }

    @Override
    public TamagachiState darDeComer() {
        return new Feliz();
    }

    @Override
    public TamagachiState darCaricias() {
        return null;
    }
}
