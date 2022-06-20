import MiResolucion.Sediento;

public class Feliz implements TamagachiState {
    @Override
    public TamagachiState darDeBeber() {
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Beep");
        return new Feliz();
    }

    @Override
    public TamagachiState darDeComer() {
        return this;
    }

    @Override
    public TamagachiState darCaricias() {
        return new Feliz();
    }
}
