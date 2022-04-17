import java.util.List;


public class Almacen {
    private List<Producto> productos;

    public double EspacioNecesario(){
        double totalEspacio = 0;
        for(Producto producto : this.productos){
            totalEspacio += producto.calcularEspacio();

        }
        return totalEspacio;
    }

    public void agregarProducto(double peso, String code){
        try {
            Producto newProducto = FactoryProducto.create(peso, code);
            this.productos.add(newProducto);
        }catch (ProductoException e){
            System.out.println("codigo invalido");

        }
    }


}