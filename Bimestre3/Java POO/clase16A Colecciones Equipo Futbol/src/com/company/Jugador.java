package com.company;

public class Jugador implements Comparable<Jugador> {
    private int numeroCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titular;

    public Jugador(int numeroCamiseta, String nombre, boolean lesionado, boolean titular) {
        this.numeroCamiseta = numeroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public boolean esTitular() {
        return this.titular;
    }

    public boolean estaLesionado() {
        return this.lesionado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Jugador)) return false;

        Jugador jugador = (Jugador) o;

        return nombre.equals(jugador.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }

    @Override
    public int compareTo(Jugador jugador) {
        return this.numeroCamiseta - jugador.getNumeroCamiseta();
    }

    @Override
    public String toString() {
        return "Jugador{" + "numeroCamiseta=" + numeroCamiseta + ", nombre='" + nombre + '\'' + '}';
    }
}
