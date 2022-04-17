package c2;

public class Funciones {

//    boolean esDivisible(int n1, int divisor){
//        if(n1%divisor==0){
//            return true;
//        }
//        return  false;
//    }

   private static boolean esDivisible(int n1, int divisor){
       return n1%divisor==0;
   }

    public static void main(String[] args){
        System.out.println(esDivisible(10,2));

    }

    public class Calculadora {

        public int sumar(int a, int b) {
            //completa esta funcion
            return a+b;
        }
        public int restar(int a, int b) {
            //completa esta funcion
            return a-b;
        }

        public int dividir(int a, int b) {
            //completa esta funcion
            return a/b;
        }

        public int multiplicar(int a, int b) {
            //completa esta funcion
            return a*b;
        }
        //escribe tus funciones aqui

    }
}
