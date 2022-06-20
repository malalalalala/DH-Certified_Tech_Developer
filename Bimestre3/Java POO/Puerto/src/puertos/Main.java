package puertos;

public class Main {

    public static void main(String[] args) {

        Puerto puerto1 = new Puerto();
        puerto1.agregarContenedores(new Contenedores(123,"Desconocida",true));
        puerto1.mostrarContenedores();
        System.out.println(puerto1.contenedoresPeligrosos());


    }
}
