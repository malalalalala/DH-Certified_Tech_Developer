public abstract class UnidadFuncional {
    private String direccion;
    private String duenio;
    private double metrosCuadrados;
    private double impuesto;
    private double valorMetroCuadrado;

    public UnidadFuncional(String direccion, String duenio, double metrosCuadrados, double impuesto, double valorMetroCuadrado) {
        this.direccion = direccion;
        this.duenio = duenio;
        this.metrosCuadrados = metrosCuadrados;
        this.impuesto = impuesto;
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public abstract double calcularPrecio();

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public double getImpuesto() {
        return impuesto;
    }

    @Override
    public String toString() {
        return "dueño: " + this.duenio + "con un precio de: " +this.calcularPrecio() +"de tipo " +this.getClass().getSimpleName();
    }
}
