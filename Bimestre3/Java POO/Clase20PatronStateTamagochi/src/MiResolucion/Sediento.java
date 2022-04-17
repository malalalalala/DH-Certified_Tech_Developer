package MiResolucion;


public class Sediento implements TamagotchiState{
    private Tamagotchi tamagotchi;

    @Override
    public TamagotchiState darDeBeber() {
        return new Feliz();

    }

    @Override
    public TamagotchiState darDeComer() {
        return new Sediento();
    }

    @Override
    public TamagotchiState darMimos() {
        return new Sediento();
    }


}
