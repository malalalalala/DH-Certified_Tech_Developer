package classes;

public class ProductoFactory {
    public static Producto construir(String tipo) {
        switch(tipo) {
            case "CAJA10X10" :
                return new Caja(10.0,10.0,10.0);
            case "PELOTAFUTBOL" :
                return new Pelota(11.0);
            case "PELOTATENIS" :
                return new Pelota(0.32);
            default:
                return null;
        }
    }
}
