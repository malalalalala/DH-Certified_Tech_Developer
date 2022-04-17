package MiResolucion;

public class Tamagotchi {
    private TamagotchiState state;

    public Tamagotchi(TamagotchiState state) {
        this.state = state;
    }

    public void recibirComida(){
        this.state=this.state.darDeBeber();
    }

    public void recibirBebida(){
        this.state=this.state.darDeComer();
    }

    public void recibirMimos(){
        this.state=this.state.darMimos();
    }

    public void setState(TamagotchiState state) {
        this.state = state;
    }
}
