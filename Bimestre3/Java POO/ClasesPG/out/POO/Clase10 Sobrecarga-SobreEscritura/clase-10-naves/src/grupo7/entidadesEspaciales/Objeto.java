public abstract class Objeto {

    private int posx;
    private int posy;
    private char direccion;

    public Objeto(int posx, int posy, char direccion) {
        this.posx = posx;
        this.posy = posy;
        this.direccion = direccion;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }

    public abstract void irA(int posx, int posy, char direccion);

    @Override
    public String toString() {
        return "\n\tPosicion X:\t" + this.posx + "\n\tPosicion Y:\t" + this.posy + "\n\tDireccion:\t" + this.direccion;
    }
}
