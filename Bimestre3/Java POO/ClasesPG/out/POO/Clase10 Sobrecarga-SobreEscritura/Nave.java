public class Nave extends Objeto{
    private double velocidad;
    private int vida;

    public Nave(int posx, int posy, char direccion, double velocidad) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = 4;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public int getVida() {
        return vida;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void irA(int posx, int posy, char direccion) {
        super.setPosx(posx);
        super.setPosy(posy);
        super.setDireccion(direccion);
    }

    public void girar(char direccion){
        super.setDireccion(direccion);
    }

    public void restarVida(int valor){
        this.vida = this.vida - valor;
        if(this.vida<0)
            System.out.println("F por la nave que acaba de ser destruida :c");
    }

//    public int hashCode() {
//        return 83 * this.vida.hashCode() * this.velocidad.hashCode();
//    }

    public boolean equals(Object o) {
        return o != null && !(o instanceof Nave) && this.hashCode() == o.hashCode();
    }

}
