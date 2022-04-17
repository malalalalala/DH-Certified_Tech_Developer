import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
                Cliente cliente1=new Cliente("Laura","Ramos","jsjs",100000.0);

        try {
//            cliente1.comprar(500);
//            cliente1.comprar(100500);
            clienteComprando(cliente1);
            clienteComprando(cliente1);
        }
        catch (ClienteException exception){
            System.out.println(exception.getMessage());
        }
        catch (InputMismatchException exception){
            System.out.println("importe inválido");
        }
        finally {
            System.out.println("se intentó comprar");
        }

        System.out.println("El programa continua");

//        }catch (RuntimeException exception){
//
//        }catch (Exception exception){
//
//        }

    }

    public static void clienteComprando(Cliente cliente1) throws ClienteException {
        System.out.println("Ingresá el valor a comprar");
        double importe=input.nextDouble();
        cliente1.comprar(importe);
    }

    //lo que aparece en el main cuando se eejecuta es un stack=pila, la que está abajo fue lo primero que pasó. lo códifo java es blanco el nuestro es azul.

    //throws ClienteException  se deja de necesitar xception 'ClienteException' is never thrown in the method

    //si no tengo el try catch se corta el flujo de ejecución

    //uso la excepción cuando el que me está usando necesita enterarse que algo falló

    //no puedo usar try catch en el mismo lugar donde lanzo la excepción con mismo lugar se refiere a método, en cliente no podría usar try-catch
}
