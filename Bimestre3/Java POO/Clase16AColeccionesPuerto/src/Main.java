public class Main {
    public static void main(String[] args) {
        Puerto puerto1=new Puerto();
        puerto1.ingresarContenedores(new Contenedor(123,"Desconocido",true));
        puerto1.mostrarContenedor();
        System.out.println(puerto1.totalContenedoresPeligrosos());
    }
}
