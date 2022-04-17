package com;

public abstract class Examen {
    private static final int NOTA_MINIMA = 4;
    private Alumno alumno;
    private String titulo;
    private String enunciado;
    private double nota;

    public Examen(Alumno alumno, String titulo, String enunciado, double nota) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public boolean estaAprobado() {
        return this.nota >= NOTA_MINIMA;
    }
}
