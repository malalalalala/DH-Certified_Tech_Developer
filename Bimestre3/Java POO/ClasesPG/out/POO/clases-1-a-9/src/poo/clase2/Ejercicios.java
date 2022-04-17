import EjercitacionEstructuras;
import EjercitacionScanner;
import EjercitacionFunciones;

public class Ejercicios {

    public static void main(String[] args) {

        System.out.println("\n\n\t------------------ CLASE 2A ------------------");
        EjercitacionEstructuras.mostrarEsDivisible(10, 2);
        EjercitacionEstructuras.mostrarEsDivisible(10, 3);
        EjercitacionEstructuras.mostrarEsDivisible(20, 4);
        EjercitacionEstructuras.mostrarEsDivisible(20, 5);
        EjercitacionEstructuras.mostrarEsDivisible(20, 7);
        EjercitacionEstructuras.mostrarEsDivisible(21, 5);

        System.out.println("\n\n\t------------------ CLASE 2S ------------------");
        System.out.println("\t------------------ Scanner 1 -----------------");
        EjercitacionScanner.pedirYMostrarDatosUsuario();

        System.out.println("\n\t---------------- Funciones 1 -----------------");
        EjercitacionFunciones.ingresarNumeroPrimo();

        System.out.println("\n\t---------------- Funciones 2 -----------------");
        EjercitacionFunciones.ingresarTresNumerosMostrarMaximo();

        System.out.println("\n\t---------------- Funciones 3 -----------------");
        EjercitacionFunciones.ingresarCadenasDeTexto();
    }
}
