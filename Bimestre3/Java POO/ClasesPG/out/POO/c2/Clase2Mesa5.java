package c2;

import java.util.Scanner;

public class Clase2Mesa5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese valor numerico");
        int n1 = input.nextInt();
        Clase2Mesa5Ejercicio1 ejercicio1 = new Clase2Mesa5Ejercicio1();
        if(!ejercicio1.esPrimo(n1)){
            System.out.println("el número no es primo");
        }else System.out.println("el número es primo");



        System.out.println("Ingrese tres valores");
        int valor1 = input.nextInt();
        int valor2 = input.nextInt();
        int valor3 = input.nextInt();
        Clase2Mesa5Ejercicio2 ejercicio2 = new Clase2Mesa5Ejercicio2();
        ejercicio2.maximoEntreTresNumeros(valor1, valor2,valor3);

        System.out.println("Ingrese dos textos");
        String texto1 = input.nextLine();
        input.nextLine();
        String texto2 = input.nextLine();
        Clase2Mesa5Ejercicio3 ejercicio3 = new Clase2Mesa5Ejercicio3();

        if (ejercicio3.cadenasDeTextoDistintas(texto1,texto2))
            System.out.println("las cadenas son iguales");
        else System.out.println("las cadenas son diferentes");
    }


}
