package c5;

public class Articulo {

    private String descripcion;
    private double precioVenta;
    private int stock;

//    Atributos, constructores y métodosEl constructor es un método que no tiene tipo de dato, se llama igual que la clase.
//    Recibe como parámetros los valores que se desea asignar inicialmente a los atributos, es decir, los valores iniciales.
//    Se puede usar para inicializar los atributos.

    public Articulo(String descripcion, int cantidad,double precio)
    {this.descripcion=descripcion;
        precioVenta=precio;
        stock=cantidad;}

    public boolean hayStock() {
        return stock>0;
    }
    public double consultarPrecio(){
        return precioVenta;
    }

    public String getDescripcion(){return descripcion;}
    public double getPrecioVenta(){return precioVenta;}
    public int getStock(){return stock;}
    //void en funciones que no devuleven nada
    public void setDescripcion(String descripcion){this.descripcion= descripcion;}
    public void setPrcioVenta(double precio){precioVenta=precio;}
    public void setStock(int stock){this.stock=stock;}


}


