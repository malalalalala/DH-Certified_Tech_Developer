package c5;

import java.util.Scanner;

public class MainUsuarioJuego {


    public static void main(String[] args) {
        String nombre;
        String clave;
        Scanner input=new Scanner(System.in);
        System.out.println("Ingresa tu nombre de usuario");
        nombre= input.nextLine();
        System.out.println("Ingresa tu clave");
        clave= input.nextLine();

        UsuarioJuego usuarioJuego=new UsuarioJuego(nombre,clave);
        usuarioJuego.aumentarPuntaje();
        System.out.println("tu puntaje es " + usuarioJuego.getPuntaje());
        usuarioJuego.subirNivel();
        System.out.println("tu nivel es " +usuarioJuego.getNivel());
        usuarioJuego.bonus(2);
        System.out.println("tu puntaje es " +usuarioJuego.getPuntaje());
        System.out.println("tu nombre de usuario es " +usuarioJuego.getNombre());
    }
}
