import poo.clase1.animales.*;

public class Ejercicios {

    public static void main(String[] args) {

        System.out.println("\n\t------------------ CLASE 1S ------------------");
        Perro perro = new Perro();
        perro.mostrarDatos();

        Pez pez = new Pez();
        pez.mostrarDatos();

        Gato gato = new Gato();
        gato.mostrarDatos();

        Tortuga tortuga = new Tortuga();
        tortuga.mostrarDatos();

        Pajaro pajaro = new Pajaro();
        pajaro.mostrarDatos();
    }
}