package com.company;

public class Triangulo extends Figura{
    private double base;
    private double altura;


    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        setArea();
    }
    @Override
    protected void setArea() {
        this.area = base * altura;
    }
}
