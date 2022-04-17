public class Local extends UnidadFuncional{

    public Local(String direccion, String duenio, double metrosCuadrados, double impuesto, double valorMetroCuadrado) {
        super(direccion, duenio, metrosCuadrados, impuesto, valorMetroCuadrado);
    }

    @Override
    public double calcularPrecio() {
        return super.getMetrosCuadrados()*super.getValorMetroCuadrado()*(1+super.getImpuesto()/100);
    }
}

