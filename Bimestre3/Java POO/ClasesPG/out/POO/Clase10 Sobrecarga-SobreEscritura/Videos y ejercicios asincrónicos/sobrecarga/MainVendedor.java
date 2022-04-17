public class MainVendedor {
    public static void main(String[] args) {
        Vendedor miVendedor = new Vendedor("Ramos", "553");
        System.out.println("sueldo a cobrar vendedor " +miVendedor.calcularSueldo());
        System.out.println("sueldo a cobrar con premio vendedor " +miVendedor.calcularSueldo(5000));
    }

}
