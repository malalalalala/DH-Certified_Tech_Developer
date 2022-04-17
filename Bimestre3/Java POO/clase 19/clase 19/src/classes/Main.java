package classes;

public class Main {
    public static void main(String[] args) {
        //creo almacen
        Almacen almacen = new Almacen();

        //cargo el almacen usando el ProductoFactory
        almacen.agregarProducto("CAJA10X10");
        almacen.agregarProducto("PELOTAFUTBOL");
        almacen.agregarProducto("PELOTATENIS");

        //Muestro la cantidad de espacio necesario que voy a necesitar para el almacen
        System.out.println("El espacio necesario es de: " + almacen.calcularEspacioNecesario());
    }
}
