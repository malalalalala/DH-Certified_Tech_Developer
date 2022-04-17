public class Simple extends Carga{
    private double pesoCarga;
    private double factorVariablePeso;


    public Simple(String nombre, double pesoCarga, double factorVariablePeso) {
        super(nombre);
        this.pesoCarga = pesoCarga;
        this.factorVariablePeso = factorVariablePeso;

    }

    @Override
    public String toString() {
        return "nombre: " + super.getNombre() + " peso: " +this.calcularPeso();
    }


    @Override
    public double calcularPeso() {
        return this.pesoCarga*this.factorVariablePeso;
    }
}
