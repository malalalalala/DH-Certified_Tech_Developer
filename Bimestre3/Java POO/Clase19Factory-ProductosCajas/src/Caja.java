public class Caja extends Producto{
    private static final double LONGITUD = 10;
    private static final double ANCHO = 10;
    private static final double ALTURA = 10;

    public Caja(double peso) {
        super(peso);
    }

    @Override
    public double calcularEspacio() {
        return LONGITUD * ANCHO * ALTURA;
    }
}
