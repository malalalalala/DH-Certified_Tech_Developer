package c3;

//Hacé un programa que te permita jugar a “Piedra, papel o tijera”.  En primer lugar, la aplicación solicita el nombre de cada gamer,
//        después empieza el juego. El juego consiste en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí
//        y utilizá una función llamada cualGana con dos parámetros con las jugadas de cada uno, que devuelve 0 en caso de empate, 1 si gana el primero,
//        2 si gana el segundo. El juego termina cuando el primero elije “*” como indicador de final.


public class Clase3Mesa7Ejercicio1 {

    Integer cualGana(String jugadaJugador1, String jugadaJugador2){
        if(jugadaJugador1.equals("piedra") && jugadaJugador2.equals("papel")){
            return 2;
        }
        else if(jugadaJugador1.equals("piedra") && jugadaJugador2.equals("piedra")) {
            return 0;
        }
        else if(jugadaJugador1.equals("piedra") && jugadaJugador2.equals("tijera")) {
            return 1;
        }
        else if(jugadaJugador1.equals("papel") && jugadaJugador2.equals("tijera")) {
            return 2;
        }
        else if(jugadaJugador1.equals("papel") && jugadaJugador2.equals("papel")) {
            return 0;
        }
        else if(jugadaJugador1.equals("papel") && jugadaJugador2.equals("piedra")) {
            return 1;
        }
        else if(jugadaJugador1.equals("tijera") && jugadaJugador2.equals("papel")) {
            return 1;
        }
        else if(jugadaJugador1.equals("tijera") && jugadaJugador2.equals("tijera")) {
            return 0;
        }
        else if(jugadaJugador1.equals("tijera") && jugadaJugador2.equals("piedra")) {
            return 2;
        }
        else {
            return 3;
        }
    }
}
