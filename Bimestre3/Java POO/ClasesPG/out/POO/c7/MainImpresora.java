package c7;
public class MainImpresora {
    public static void main(String[] args) {
        Impresora epson = new Impresora("XNS453", "12-12-2021", "USB");
        Impresora lenovo = new Impresora("XNS453", "12-12-2021", "USV");
        epson.setCantidadHojas(-20);
        epson.setCantidadHojas(20);
        epson.imprimir("Hola mundo");
    }
}
