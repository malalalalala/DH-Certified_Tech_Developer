package c2;

//Hacer una función que dado un número indica si es un número primo o no. Un número
//        primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo,
//        ya que 25 es divisible por 1, 5 y 25. 17 sí es primo porque solo se puede dividir por 1 y por
//        17.
//        Usar esta función en un programa, que permita el ingreso de un número y luego llame a la
//        función desarrollada para comprobar si es primo o no. Para resolverlo usar la función
//        obtenida en el ejercicio desarrollado en la clase asincrónica. boolean esDivisible(int n, int
//        divisor)

public class Clase2Mesa5Ejercicio1 {

    public boolean esPrimo(int n1){
        if (n1 == 0 || n1 == 1)
            return false;
        for (int i = 2; i < n1; i++) {
            if (n1 % i == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sÃ­ es primo
        return true;

    }

}