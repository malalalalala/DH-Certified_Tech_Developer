public abstract class Producto {
    private double peso;

    public Producto(double peso) {
        this.peso = peso;
    }

    abstract public double calcularEspacio();
}
