public class Asteroide extends Objeto {

    private Integer lesion;

    public Asteroide(int posx, int posy, char direccion, int lesion) {
        super(posx, posy, direccion);
        this.lesion = lesion;
    }

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }

    @Override
    public void irA(int posx, int posy, char direccion) {
        super.setPosx(posx);
        super.setPosy(posy);
        super.setDireccion(direccion);
    }

    @Override
    public int hashCode() {
        return 83 * this.lesion.hashCode();
    }

    @Override
    public boolean equals (Object o){
        return (!(o == null || o instanceof Asteroide) && this.hashCode() == o.hashCode());
    }
}
