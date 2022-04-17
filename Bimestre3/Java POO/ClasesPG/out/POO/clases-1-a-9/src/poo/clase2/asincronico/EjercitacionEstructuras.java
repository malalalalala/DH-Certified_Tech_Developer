public class EjercitacionEstructuras {

    //    Definir dos números enteros. Asignarles un valor a cada uno. Comprobar si un número es
    //    divisible por el segundo e indicar mediante un mensaje el resultado obtenido.
    public static boolean esDivisible(int dividendo, int divisor) {
        return (dividendo % divisor == 0);
    }

    public static void mostrarEsDivisible(int dividendo, int divisor) {
        if (esDivisible(dividendo, divisor)) {
            System.out.println(dividendo + " es divisible por " + dividendo);
        } else {
            System.out.println(dividendo + " no es divisible por " + dividendo);
        }
    }
}
