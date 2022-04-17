package MiResolucion;

public class Hambriento implements TamagotchiState{
    @Override
    public TamagotchiState darDeBeber() {
        return this;
    }

    @Override
    public TamagotchiState darDeComer() {
        return new Feliz();
    }

    @Override
    public TamagotchiState darMimos() {
        return this;
    }
}
