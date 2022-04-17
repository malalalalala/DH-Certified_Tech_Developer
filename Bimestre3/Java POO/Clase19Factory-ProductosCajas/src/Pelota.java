public class Pelota extends Producto{
    private double radio;


    public Pelota(double peso, double radio) {
        super(peso);
        this.radio = radio;
    }

    @Override
    public double calcularEspacio() {
        return radio * radio;
    }
}
