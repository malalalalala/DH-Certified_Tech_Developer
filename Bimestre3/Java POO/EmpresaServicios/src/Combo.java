import java.util.Set;

public class Combo extends Servicio{

    private double descuento;
    private Set<Simple> listaSimples;

    public Combo(String nombre, String descripcion, double descuento, Set<Simple> listaSimples) {
        super(nombre, descripcion);
        this.descuento = descuento;
        this.listaSimples = listaSimples;
    }


    @Override
    public double calcularPrecio() {


        ;
    }
}
