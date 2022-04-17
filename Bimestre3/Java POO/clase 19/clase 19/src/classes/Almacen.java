package classes;

import java.util.ArrayList;
import java.util.List;

public class Almacen {
    private List<Producto> productos = new ArrayList<>();

    public double calcularEspacioNecesario() {
        double espacioNecesario = 0;
        for(Producto p : this.productos) {
            espacioNecesario += p.calcularEspacio();
        }
        return espacioNecesario;
    }

    public void agregarProducto(String producto) {
        this.productos.add(ProductoFactory.construir(producto));
    }
}
