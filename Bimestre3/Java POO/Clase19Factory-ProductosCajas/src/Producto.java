public abstract class Producto {
    private double peso;

    public Producto(double peso) {
        this.peso = peso;
    }

    public abstract double calcularEspacio();
}
