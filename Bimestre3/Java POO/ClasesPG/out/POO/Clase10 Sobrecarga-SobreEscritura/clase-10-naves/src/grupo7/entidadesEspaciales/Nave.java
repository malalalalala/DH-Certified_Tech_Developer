public class Nave extends Objeto {

    private Double velocidad;
    private Integer vida;

    public Nave(int posx, int posy, char direccion, double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void girar(char direccion) {
        super.setDireccion(direccion);
    }

    @Override
    public void irA(int posx, int posy, char direccion) {
        if(super.getDireccion() != direccion) {
            this.girar(direccion);
        }
        super.setPosx(posx);
        super.setPosy(posy);
        super.setDireccion(direccion);
    }

    public void restaVida(int valor) {
        this.vida -= valor;
        if (this.vida < 0) {
            System.out.println("F por la nave que acaba de ser destruida :c");
        }
    }

    @Override
    public int hashCode() {
        return 83 * this.vida.hashCode() * this.velocidad.hashCode();
    }

    @Override
    public boolean equals (Object o){
        return (!(o == null || o instanceof Nave) && this.hashCode() == o.hashCode());
    }
}
