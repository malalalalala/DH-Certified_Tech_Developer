package com.company;

import java.util.Set;

public class Programa extends OfertaAcademica {
    private double bonificacion;
    private Set<Curso> cursos;

    public Programa(String nombre, String descripcion, double bonificacion, Set<Curso> cursos) {
        super(nombre, descripcion);
        this.bonificacion = bonificacion;
        this.cursos = cursos;
    }

    @Override
    public double calcularPrecio() {
        double totalPrecio = 0;
        double descuento;
        for (Curso curso : this.cursos) {
            totalPrecio += curso.calcularPrecio();
        }
        descuento = (1 - (this.bonificacion / 100)) * totalPrecio;
        return totalPrecio - descuento;
    }

    @Override
    public String toString() {
        return super.getNombre() + " $ " + this.calcularPrecio();
    }
}
