package ejercicios_resueltos;

/*
    Escribir una función que reciba tres números y devuelva el máximo entre los tres números.
    Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer
    unNumeroC)
    Luego hacer un programa que permita el ingreso de 3 valores, utilice la función y muestre
    el resultado.
 */
public class Clase2Ejercicio2 {

    public Integer maximoEntreTresNumeros(Integer unNumeroA, Integer unNumeroB, Integer unNumeroC) {

        Integer maximo = unNumeroA;

        if(maximo < unNumeroB) {
            maximo = unNumeroB;
        }
        if(maximo < unNumeroC) {
            maximo = unNumeroC;
        }

        System.out.println("El maximo de " + unNumeroA + " , " + unNumeroB + " y " + unNumeroC + " es " + maximo);
        return maximo;
    }

}
