package com;

public class Final extends Examen implements Comparable {
    private double notaOral;
    private String descripcion;

    public Final(Alumno alumno, String titulo, String enunciado, double nota, double notaOral, String descripcion) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcion = descripcion;
    }

    @Override
    public boolean estaAprobado() {
        return false;
    }

    @Override
    public int compareTo(Object o) {
        double promedioEsteExamen = (super.getNota() + this.notaOral) / 2;
        Final examenComparable = (Final) o;
        double promedioComparable = (examenComparable.getNota() + examenComparable.notaOral) / 2;
        return promedioEsteExamen - promedioComparable;
    }
}
