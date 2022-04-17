package MiResolucion;

public class Feliz implements TamagotchiState{
    @Override
    public TamagotchiState darDeBeber() {
        System.out.println("beep");
        System.out.println("beep");
        System.out.println("beep");
        System.out.println("beep");
        System.out.println("beep");
        return new Feliz();
    }

    @Override
    public TamagotchiState darDeComer() {
        return new Feliz();
        //tambien podria poner this en lugar de new Feliz();mejor crear la instancia
    }

    @Override
    public TamagotchiState darMimos() {
        return new Feliz();
    }
}
