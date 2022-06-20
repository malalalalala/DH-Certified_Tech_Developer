package com.company;

public class Rectangulo extends Figura{
    private double largo;
    private double alto;

    public Rectangulo(double largo, double alto) {
        this.largo = largo;
        this.alto = alto;
        setArea();
    }

    @Override
    protected void setArea() {
        this.area = largo * alto;
    }
}
