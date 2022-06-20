import poo.clase2.asincronico.EjercitacionEstructuras;
import java.util.Scanner;

public class EjercitacionFunciones {

    /******************************** EJ 1 ********************************/
    //    Hacer una función que dado un número indica si es un número primo o no. Un número primo es aquel
    //    que solo puede dividirse entre 1 y sí mismo. Por ejemplo:
    //      25 no es primo, ya que 25 es divisible por 1, 5 y 25.
    //      17 sí es primo porque solo se puede dividir por 1 y por 17.
    //    Para resolverlo usar la función obtenida en el ejercicio desarrollado en la clase asincrónica:
    //      boolean esDivisible(int n, int divisor)
    private static boolean esNumeroPrimo(int numero) {
        // Opcion 1
        //        for (int i = 2; i < numero; i++) {
        //            if (EjercitacionEstructuras.esDivisible(numero, i)) {
        //                return false;
        //            }
        //        }
        //        return true;

        // Opcion 2
        // Si el numero es 0 o 1 o par, guardo false en esPrimo para que despues NO entre al while
        boolean esPrimo = !(numero == 0 || numero == 1 || (numero % 2 == 0));
        int i = 3;

        // Si el numero es distinto de 2 (sé que 2 es primo)...
        if (numero == 2) {
            esPrimo = true;
        } else {
            // Mientras el numero sea primo (esPrimo == true) y (i*i <= numero)
            while (esPrimo && i * i <= numero) {
                // Actualizo la variable esPrimo con el valor negado de esDivisible(numero, i)
                esPrimo = !EjercitacionEstructuras.esDivisible(numero, i);
                // Incremento el iterador de a 2 en 2 para pasar solo por los numeros impares
                i += 2;
            }
        }

        return esPrimo;
    }

    //    Usar esta función en un programa, que permita el ingreso de un número y luego llame a la función desarrollada
    //    para comprobar si es primo o no.
    public static void ingresarNumeroPrimo() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("\tIngresá un número para ver si es primo: ");
        numero = scanner.nextInt();

        mostrarSiNumeroEsPrimo(numero);
    }

    private static void mostrarSiNumeroEsPrimo(int n) {
        if (esNumeroPrimo(n)) {
            System.out.println("\tEs primo!");
        } else {
            System.out.println("\tNo es primo!");
        }
    }

    /******************************** EJ 2 ********************************/
    //  Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
    //  Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC)
    //  Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre el resultado.
    private static Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC) {
        Integer mayor;

        // ¿A > B?
        if (unNumeroA.compareTo(unNumeroB) > 0) {
            mayor = unNumeroA;
        } else {
            mayor = unNumeroB;
        }

        // ¿C > Mayor?
        if (unNumeroC.compareTo(mayor) > 0) {
            mayor = unNumeroC;
        }

        return mayor;
    }

    public static void ingresarTresNumerosMostrarMaximo() {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.println("\tIngresá el primer número: ");
        numero1 = scanner.nextInt();

        System.out.println("\tIngresá el segundo número: ");
        numero2 = scanner.nextInt();

        System.out.println("\tIngresá el tercer número: ");
        numero3 = scanner.nextInt();

        Integer maximo = maximoEntreTresNumeros(numero1, numero2, numero3);
        System.out.println("\tEl máximo es: " + maximo);
    }

    /******************************** EJ 3 ********************************/
    //  Escribir una función:
    //  boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB)
    //  que debe tomar dos cadenas de texto y devolver true, en caso de que sean distintos, o false, en caso de que coincidan.
    private static boolean cadenasDeTextoDistintas(String unTextoA, String unTextoB) {
        return !unTextoA.equals(unTextoB);
    }

    public static void ingresarCadenasDeTexto() {
        Scanner scanner = new Scanner(System.in);
        String cadena1, cadena2;

        System.out.println("\tIngresá el primer texto: ");
        cadena1 = scanner.nextLine();

        System.out.println("\tIngresá el segundo texto: ");
        cadena2 = scanner.nextLine();

        if (cadenasDeTextoDistintas(cadena1, cadena2)) {
            System.out.println("\t" + cadena1 + " y " + cadena2 + " son distintas");
        } else {
            System.out.println("\t" + cadena1 + " y " + cadena2 + " son iguales");
        }
    }
}