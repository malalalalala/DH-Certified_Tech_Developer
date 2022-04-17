package ejercicios_resueltos;

import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {

        //Ejercicio 1
        Clase2Ejercicio1 ejercicio1 = new Clase2Ejercicio1();

        if(ejercicio1.esPrimo(6)) {
            System.out.println(3 + " es primo");
        }
        else {
            System.out.println(3 + " no es primo");
        }

        System.out.println("------------------------");

        //Ejercicio 2
        Clase2Ejercicio2 ejercicio2 = new Clase2Ejercicio2();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor para el numero A:");
        Integer unNumeroA = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el valor para el numero B:");
        Integer unNumeroB = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese el valor para el numero C:");
        Integer unNumeroC = scanner.nextInt();
        scanner.nextLine();

        ejercicio2.maximoEntreTresNumeros(unNumeroA, unNumeroB, unNumeroC);

        System.out.println("------------------------");
        
        //Ejercicio 3
        Clase2Ejercicio3 ejercicio3 = new Clase2Ejercicio3();

        if(ejercicio3.cadenasDeTextoDistintas("Hola", "Chau")) {
            System.out.println("Son distintas");
        }
        else {
            System.out.println("Son iguales");
        }
    }
}
