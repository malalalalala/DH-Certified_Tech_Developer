import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Producto papas = new Producto("papas fritas", 500);
        Producto ensalada2 = new Producto("cesar", 950);
        Producto gaseosa = new Producto("coca", 200);
        Producto ensalada = new Producto("rusa", 750);
        Producto milanga = new Producto("milanosaurio", 50);
        List<Producto> productosCombo1 = new ArrayList<>();
        productosCombo1.add(ensalada);
        productosCombo1.add(milanga);
        Combo combo1 = new Combo(productosCombo1, 250);
        Carrito carrito = new Carrito();
        carrito.agregarItem(papas);
        carrito.agregarItem(ensalada2);
        carrito.agregarItem(gaseosa);
        carrito.agregarItem(combo1);
        System.out.print("El precio total del carrito es: $");
        System.out.println(carrito.calcularPrecioTotal());
    }
}
