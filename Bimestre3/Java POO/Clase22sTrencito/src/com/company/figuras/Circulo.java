package com.company.figuras;

import com.company.interfaz.Calculable;

public class Circulo implements Calculable {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularAreaTotal() {
        return radio*radio*Math.PI;
    }
}
