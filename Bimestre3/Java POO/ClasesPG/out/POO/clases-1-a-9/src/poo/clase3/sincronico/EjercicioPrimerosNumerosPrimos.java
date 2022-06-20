import java.util.Scanner;

public class EjercicioPrimerosNumerosPrimos {

    public static boolean esDivisible(int dividendo, int divisor) {
        return (dividendo % divisor == 0);
    }

    public static boolean esNumeroPrimo(int numero) {
        // Si el numero es 0 o 1 o par, guardo false en esPrimo para que despues NO entre al while
        boolean esPrimo = !(numero == 0 || numero == 1 || (numero % 2 == 0));
        int i = 3;

        if (numero == 2) {
            esPrimo = true;
        } else {
            // Mientras el numero sea primo (esPrimo == true) y (i*i <= numero)
            while (esPrimo && i * i <= numero) {
                // Actualizo la variable esPrimo con el valor negado de esDivisible(numero, i)
                esPrimo = !esDivisible(numero, i);
                // Incremento el iterador de a 2 en 2 para pasar solo por los numeros impares
                i += 2;
            }
        }

        return esPrimo;
    }

    public static void mostrarPrimerosNumerosPrimos(int cdadPrimos) {
        System.out.println("Los primeros " + cdadPrimos + " números primos son: ");
        int cdadActualPrimos = 0, i = 0;
        while (cdadActualPrimos < cdadPrimos && i < 10000000) {
            if (esNumeroPrimo(i) && (cdadActualPrimos + 1 == cdadPrimos)) {
                System.out.print(i + ".");
                cdadActualPrimos++;
            } else if (esNumeroPrimo(i)) {
                System.out.print(i + ", ");
                cdadActualPrimos++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para ver los primeros n numeros primos:");
        mostrarPrimerosNumerosPrimos(scanner.nextInt());
    }
}