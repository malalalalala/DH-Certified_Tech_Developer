package com.company;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
        setArea();
    }

    @Override
    protected void setArea(){
        this.area = Math.pow((Math.PI * this.radio), 2);
    }

}


