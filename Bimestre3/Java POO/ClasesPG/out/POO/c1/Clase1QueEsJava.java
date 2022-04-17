    package c1;

    import java.util.Date;

    public class Clase1QueEsJava {

    public static void main(String[] args){

        Date fecha = new Date(86,2,5);
        System.out.println(fecha.toString());

        Date fecha2=new Date();
        System.out.println(fecha2.toString());

        System.out.println("Hola Mundo");
//        int numeroEntero=5;
//        double numeroConComa=0.5;
//        String nombre="Laura";

        int numeroEntero=5;
        double numeroConComa =2.5;
        double suma=numeroEntero+numeroConComa;
        System.out.println(suma);
//        Ejercitación Estructuras

//        Ejercicio 1
//        Definir dos números enteros. Asignarles un valor a cada uno. Comprobar si un número es
//        divisible por el segundo e indicar mediante un mensaje el resultado obtenido.
//        NOTA: Que sea divisible quiere decir que al dividir da un valor exacto, es decir, sin
//        decimales.
//
//¡Hasta la próxima!

        int n1=10;
        int n2=2;
//        for(Integer i=1;i<=2;i++){
            if(n1%n2==0){
                System.out.println(n1 + " es divisible por " + n2);
            }else System.out.println(n1 + " No es divisible por " +n2);


        double numeroUno = 20.00;
        double numeroDos = 2.00;
        double resultado = numeroUno / numeroDos;
        int intResultado=(int) resultado;
        if ((numeroUno % numeroDos) == 0){
            System.out.println(intResultado + " Es divisible");
        } else {
            System.out.println(intResultado + " No es divisible");
        }

        String cadenauno;
        cadenauno = "ho";
        String cadenados = "alo";
        int compara;
        if (cadenauno.equals(cadenados)){
            System.out.println("son iguales");
        } else {
            compara = cadenauno.compareTo(cadenados);
            System.out.println(compara);
            if (compara > 0){
                System.out.println("cadena1 es mayor a cadena2");
            } else {
                System.out.println("cadena2 es mayor a cadena1");
            }
        }

    }
}
