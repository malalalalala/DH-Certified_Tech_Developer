package MiResolucion;

public class Triste implements TamagotchiState{
    @Override
    public TamagotchiState darDeBeber() {
        System.out.println("beep");
        System.out.println("beep");
        System.out.println("beep");
        System.out.println("titilo");
        return new Triste();
    }

    @Override
    public TamagotchiState darDeComer() {
        System.out.println("beep");
        System.out.println("beep");
        System.out.println("ojo que vomito todoooo");
        return new Triste();
    }

    @Override
    public TamagotchiState darMimos() {
        return new Feliz();
    }
}
