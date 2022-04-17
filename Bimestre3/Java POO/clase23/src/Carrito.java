import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<Presupuestable> items;

    public Carrito() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(Presupuestable item) {
        this.items.add(item);
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Presupuestable item: this.items) {
            total += item.calcularPrecioFinal();
        }
        return total;
    }
}
