import java.util.HashSet;
import java.util.Set;

public class Shopping extends UnidadFuncional{
    private Set<Local> locales;

    public Shopping(String direccion, String duenio, double metrosCuadrados, double impuesto, double valorMetroCuadrado) {
        super(direccion, duenio, metrosCuadrados, impuesto, valorMetroCuadrado);
        this.locales=new HashSet<>();
    }

   public void agregarLocales(Local local){
        this.locales.add(local);
   }

    @Override
    public double calcularPrecio() {
        double precioSubtotal=0;
        for (Local local:this.locales) {
            precioSubtotal+=local.calcularPrecio();
        }
        return precioSubtotal*(1+getImpuesto()/100);
    }
}
