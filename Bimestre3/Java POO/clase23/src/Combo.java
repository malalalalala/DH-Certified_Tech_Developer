import java.util.List;

public class Combo implements Presupuestable {
    private double precioTotal;
    private List<Producto> productos;
    private double descuento;

    public Combo(List<Producto> productos, double descuento) {
        this.productos = productos;
        this.descuento = descuento;
        this.setPrecioTotal();
    }
//este método lo dispara el conbstructor porque ahí ya sé cuál es la lista, siempre me debe levantar un warning un atributo que no esté usando
    private void setPrecioTotal() {
        this.precioTotal = 0;
        for (Producto producto : this.productos) {
            this.precioTotal += producto.calcularPrecioFinal();
        }
    }

    @Override
    public double calcularPrecioFinal() {
        return this.precioTotal - this.descuento;
    }
}
