import poo.clase5.sincronico.Cliente;
import poo.clase5.sincronico.UsuarioJuego;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        probarCliente();
        probarUsuarioJuego();
    }

    public static void probarCliente() {
        Scanner scanner = new Scanner(System.in);
        String nombreCliente;
        Double monto;

        System.out.print("\n\tIngrese el nombre del cliente: ");
        nombreCliente = scanner.nextLine();

        Cliente cliente = new Cliente("1", nombreCliente);

        System.out.print("\tIngrese monto del objeto que pagó el cliente: ");
        monto = scanner.nextDouble();
        cliente.incrementarDeuda(monto);

        cliente.mostrarDeuda();
        cliente.pagarDeuda();
        cliente.mostrarDeuda();

        System.out.print("\tIngrese monto del objeto que pagó el cliente: ");
        monto = scanner.nextDouble();
        cliente.incrementarDeuda(monto);
        cliente.mostrarDeuda();

        System.out.print("\tIngrese monto del objeto que pagó el cliente: ");
        monto = scanner.nextDouble();
        cliente.incrementarDeuda(monto);
        cliente.mostrarDeuda();

        cliente.pagarDeuda();
        cliente.mostrarDeuda();
    }

    public static void probarUsuarioJuego() {
        Scanner scanner = new Scanner(System.in);
        String nombreUsuario, claveUsuario, valorStr;
        int valor;

        System.out.print("\n\tIngrese el nombre del usuario: ");
        nombreUsuario = scanner.nextLine();

        System.out.print("\n\tIngrese la clave del usuario: ");
        claveUsuario = scanner.nextLine();

        UsuarioJuego usuario = new UsuarioJuego(nombreUsuario, claveUsuario);

        System.out.print("\n\tEl jugador " + usuario.getNombre() + " tiene " + usuario.getPuntaje() + " puntos y está en el nivel " + usuario.getNivel());
        usuario.aumentarPuntaje();
        usuario.subirNivel();
        System.out.print("\n\tEl jugador " + usuario.getNombre() + " tiene " + usuario.getPuntaje() + " puntos y está en el nivel " + usuario.getNivel());

        System.out.print("\n\tIngrese el valor del bonus que ganó el usuario: ");
        valorStr = scanner.nextLine();
        // verificacion de valorStr
        valor = Integer.parseInt(valorStr);
        usuario.bonus(valor);
        System.out.print("\n\tEl jugador " + usuario.getNombre() + " tiene " + usuario.getPuntaje() + " puntos y está en el nivel " + usuario.getNivel());
    }
}
