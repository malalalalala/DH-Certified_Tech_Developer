package com.company;

public abstract class Figura implements CalculableArea{
    protected double area;

    public Figura() {
    }

    protected abstract void setArea();

    @Override
    public double getArea() {
        return area;
    }
}
