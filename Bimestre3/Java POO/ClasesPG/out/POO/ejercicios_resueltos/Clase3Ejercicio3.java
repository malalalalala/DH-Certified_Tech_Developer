package ejercicios_resueltos;

import java.util.Scanner;

public class Clase3Ejercicio3 {
    public static void main(String[] args) {
        /*
            Implementar un programa que nos permite mostrar por consola los primeros “n” números
            primos, siendo “n” un valor numérico ingresado por consola. Por ejemplo: Con n=7, lo
            que debería devolver el programa es “Los primeros 7 números primos son: 2, 3, 5, 7, 11, 13,
            17”.
         */
        //Scanneo el input de n
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();
        scanner.nextLine();

        //contador de numeros primos y variable i para usar de indice
        int contadorPrimos = 0;
        int i = 1;
        //Corto ya cuando alcance la cantidad de numeros primos (n) que busco
        while(contadorPrimos < n) {
            int contadorDivisores = 1;
            //encuentro los divisores del numero
            for(int j = 2; j <= i; j ++) {
                if(i % j == 0) {
                    contadorDivisores ++;
                }
            }
            //veo si es primo o no
            if(contadorDivisores == 2) {
                contadorPrimos ++;
                System.out.println(i);
            }
            i ++;
        }
    }
}
