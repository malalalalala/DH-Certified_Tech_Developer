import MiResolucion.Sediento;

public class Triste implements TamagachiState {
    @Override
    public TamagachiState darDeBeber() {
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Vomito");
        return this;
    }

    @Override
    public TamagachiState darDeComer() {
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Beep");
        System.out.println("Titilando");
        return this;
    }

    @Override
    public TamagachiState darCaricias() {
        return new Sediento.Feliz();
    }
}
