package classes;

import exceptions.ClientesException;


//IMPORTANTE: cada exception corta el programa, entonces para llegar a la segunda exception la linea donde se arroja
//            la anterior deberia ser comentada (comentar linea 13 si se quiere probar la linea 16)
public class Main {
    public static void main(String[] args) throws ClientesException {
        Cliente cliente = new Cliente("Pedro","Martinez", "123456789", 500.0);

        //El cliente intenta comprar mas alla de su limite establecido (arroja exception)
        cliente.comprar(501);

        //El cliente intenta pagar su deuda pero no tiene (arroja exception) -> comentar la linea 13 para llegar aca
        cliente.saldarDeuda(100);
    }
}
