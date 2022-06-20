package com.company.figuras;

import com.company.interfaz.Calculable;

public class Rectangulo implements Calculable {

    private double alto;
    private double largo;

    public Rectangulo(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public double calcularAreaTotal() {
        return alto*largo;
    }
}
