public class FactoryProducto {
    public static Producto create(double peso, String code) throws ProductoException {
        return switch (code) {
            case "PELOTA-FUTBOL" -> new Pelota(peso, 11.0);
            case "PELOTA-TENIS" -> new Pelota(peso, 0.32);
            case "CAJA" -> new Caja(peso);
            default -> throw new ProductoException();
        };
    }

}
