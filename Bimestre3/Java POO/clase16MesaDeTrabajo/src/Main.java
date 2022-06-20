public class Main {
    public static void main(String[] args) {
        Contenedor c1 = new Contenedor(123, "Desconocida", true);
        Contenedor c2 = new Contenedor(124, "Brasil", false);
        Contenedor c3 = new Contenedor(125, "Desconocida", true);

        Puerto p = new Puerto ("Buenos Aires");

        p.agregarContenedor(c3);
        p.agregarContenedor(c1);
        p.agregarContenedor(c2);

        p.mostrarContenedores();
        System.out.println(p.contarContenedoresPeligrosos());




    }
}
