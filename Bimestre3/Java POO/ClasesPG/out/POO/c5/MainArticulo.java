package c5;

public class MainArticulo {
    public static void main(String[] args){
        Articulo articulo=new Articulo("articulo1",100,1100);{
            if(articulo.hayStock()) {
                System.out.println("hay stock disponible");
            }
            System.out.println("el precio de venta es " +articulo.consultarPrecio());
        }
    }
}
