package com.company.figuras;

import com.company.interfaz.Calculable;

public class Triangulo implements Calculable {

    private double alto;
    private double base;

    public Triangulo(double alto, double base) {
        this.alto = alto;
        this.base = base;
    }

    @Override
    public double calcularAreaTotal() {
        return alto*base/2;
    }
}
