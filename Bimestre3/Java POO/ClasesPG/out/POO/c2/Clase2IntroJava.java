package c2;
import java.util.Date;
import java.util.Scanner;

public class Clase2IntroJava {
    public static void main(String[] args){
        String nombre = "Juan";
//        nombre.equals("Juan");
        int cantidad;
        char inicial;
        cantidad= nombre.length();
        nombre.toUpperCase();
        inicial = nombre.charAt(0);
        if(nombre.toUpperCase().equals("JUAN")){
            System.out.println("Se pasó a mayúscula y tiene " +cantidad + " número de letras y empieza por " + inicial);
        }

        Integer valor1=10;
        Integer valor2=30;
        int comparar;
        if (valor1.equals(valor2)) System.out.println("Son iguales");
        else{comparar=valor1.compareTo(valor2);
            System.out.println(comparar);
            if (comparar>0)System.out.println("valor1 es mayor que valor2");
            else System.out.println("valor2 es mayor que valor1");}

        Date fecha=new Date();
        System.out.println(fecha.toString());

//        Ejercicio 1
//        Definir dos cadenas de texto. Comprobar si son iguales o distintas e indicar mediante un
//        mensaje.
//
//                Ejercicio 2
//
//        Definir dos Integer y determinar cuál es mayor, cuál es menor o si son iguales.
//        Informar el resultado obtenido.
//
//¡Hasta la próxima!
        String text1="hola";
        String text2="holi";

        if(text1.compareTo(text2)==0){
            System.out.println("son iguales");
        }else System.out.println("son diferentes");

        Integer number1=5;
        Integer number2=10;

        if(number1.equals(number2))System.out.println("son iguales");
        else{
            if(number1.compareTo(number2)>0)
                System.out.println(number1 + " es mayor a " +number2);
            else System.out.println(number2 + " es mayor a " +number1);
        }

        Scanner lector;
        lector=new Scanner(System.in);

        int numb1;
        int numb2;
        float coeficiente;

        System.out.println("Ingrese primer valor");
        numb1= lector.nextInt();
        System.out.println("Ingrese segundo valor");
        numb2= lector.nextInt();
        System.out.println("Ingrese el coeficiente");
        coeficiente= lector.nextFloat();


        lector.nextLine();
        String nombrecito;
        char inicialita;
        System.out.println("Ingrese su nombre");

        nombrecito=lector.nextLine();
        inicialita=nombrecito.charAt(0);
        System.out.println(inicialita);

//        String nombre2;
//
//        if (nombre2==null)
//        {
//            System.out.println("Cadena con valor nulo");
//        }


//        Ingresá tu nombre y tu apellido por separado, a partir de estas variables debés obtener en
//        una tercera tus iniciales.

        String name;
        String lastname;
        String iniciales;

        System.out.println("Ingrese su nombre");
        name= lector.nextLine();
        System.out.println("Ingrese su apellido");
        lastname= lector.nextLine();
//        iniciales=("las iniciales son" +lastname.charAt(0) + " y " + name.charAt(0))  ;
        iniciales=name.substring(0,1) + lastname.substring(0,1) ;
        System.out.println(iniciales);






    }


}
