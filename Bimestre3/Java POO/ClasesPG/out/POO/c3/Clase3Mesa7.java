package c3;
import java.util.Scanner;


public class Clase3Mesa7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingresa tu nombre");
        String jugador1 = scanner.nextLine();
        System.out.println("ingresa tu nombre");
        String jugador2 = scanner.nextLine();

        String jugadaJugador1="";
        String jugadaJugador2="";
        int puntosJugador1 = 0;
        int puntosJugador2 = 0;

        Clase3Mesa7Ejercicio1 ejercicio1= new Clase3Mesa7Ejercicio1();

        while (!jugadaJugador1.equals("*") || !jugadaJugador2.equals("*")) {
            System.out.println("ingresa piedra, papel o tijera");
            jugadaJugador1 = scanner.nextLine();
            if (jugadaJugador1.equals("*"))
                break;
            System.out.println("ingresa piedra, papel o tijera");
            jugadaJugador2 = scanner.nextLine();
            if( jugadaJugador2.equals("*"))
                break;
            else if (ejercicio1.cualGana(jugadaJugador1, jugadaJugador2).equals(0)) {
                    System.out.println("empate");
            } else if (ejercicio1.cualGana(jugadaJugador1, jugadaJugador2).equals(1)) {
                    System.out.println("en esta ronda ganó " + jugador1);
                     puntosJugador1 ++;;
            } else{ System.out.println("en esta ronda ganó " + jugador2);
                   puntosJugador2 ++;}
        }

        if(puntosJugador1>puntosJugador2) System.out.println("Ganó "  + jugador1);
        else if(puntosJugador2>puntosJugador1) System.out.println("Ganó "  + jugador2);
        else System.out.println("hubo empate");
    }
}
