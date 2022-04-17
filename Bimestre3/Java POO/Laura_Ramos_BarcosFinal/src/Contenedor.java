import java.util.List;

public class Contenedor extends Carga{
    private double pesoPropioContenedor;
    private List<Simple> cargasSimples;

    public Contenedor(String nombre, double pesoPropioContenedor,List<Simple> cargasSimples) {
        super(nombre);
        this.pesoPropioContenedor = pesoPropioContenedor;
        this.cargasSimples=cargasSimples;
    }


    @Override
    public double calcularPeso() {
        double pesoCargas=0;
        for (Simple cargaSimple: this.cargasSimples) {
          pesoCargas +=cargaSimple.calcularPeso();
        };
        return pesoCargas+pesoPropioContenedor;
    }

    @Override
    public String toString() {
        return "nombre: " + super.getNombre() + " peso: " +this.calcularPeso();
    }
}
