package com.company;

import java.util.Set;
import java.util.TreeSet;

public class Equipo {
    private String nombre;
    private Set<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new TreeSet<>();
    }

    public void addJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public void mostrarTitulares() {
        for (Jugador jugador : this.jugadores) {
            if (jugador.esTitular()) {
                System.out.println(jugador);
            }
        }
    }

    public int totalTitularesLesionados() {
        int total = 0;
        for (Jugador jugador : this.jugadores) {
            if (jugador.esTitular() && jugador.estaLesionado()) {
                total++;
            }
        }
        return total;
    }
}
