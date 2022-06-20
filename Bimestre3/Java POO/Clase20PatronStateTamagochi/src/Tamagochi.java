public class Tamagochi {
    private TamagachiState state;

    public Tamagochi(TamagachiState state) {
        this.state = state;
    }

    private TamagachiState getState() {
        return state;
    }

    public void setState(TamagachiState state) {
        this.state = state;
    }

    public void recibirBebida() {
        this.state = this.getState().darDeBeber();
    }

    public void recibirComida() {
        this.state = this.state.darDeComer();
    }

    public void recibirCaricias() {
        this.state = this.state.darCaricias();
    }
}
