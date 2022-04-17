package com;

public class Parcial extends Examen {
    private int unidad;
    private int reintentosRealizados;

    public Parcial(Alumno alumno, String titulo, String enunciado, double nota, int unidad, int reintentosRealizados) {
        super(alumno, titulo, enunciado, nota);
        this.unidad = unidad;
        this.reintentosRealizados = reintentosRealizados;
    }

    public boolean sePuedeRecuperar() {
        return false;
    }
}
