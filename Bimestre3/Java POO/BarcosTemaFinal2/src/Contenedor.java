import java.util.List;

public class Contenedor extends Carga{
    private double pesoPropioContenedor;
    private List<CargaSimple> cargasSimples;

    public Contenedor(String nombre, String descripcion, double pesoPropioContenedor,List<CargaSimple> cargasSimples) {
        super(nombre, descripcion);
        this.pesoPropioContenedor = pesoPropioContenedor;
        this.cargasSimples=cargasSimples;
    }


    @Override
    public double calcularPeso() {
        double pesoCargas=0;
        for (CargaSimple cargaSimple: this.cargasSimples) {
          pesoCargas +=cargaSimple.calcularPeso();
        };
        return pesoCargas+pesoPropioContenedor;
    }

    @Override
    public String toString() {
        return "nombre: " + super.getNombre() + "peso: $" +this.calcularPeso();
    }
}
