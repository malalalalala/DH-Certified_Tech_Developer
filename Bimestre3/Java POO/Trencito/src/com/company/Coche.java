package com.company;

import java.util.List;

public class Coche implements CalculableArea {

    private String nombre;
    private double area;
    private List<CalculableArea> figuras;

    public Coche(String nombre, List<CalculableArea> figuras) {
        this.nombre = nombre;
        this.figuras = figuras;
        setArea();
    }

    private void setArea(){
        this.area = 0;
        for (CalculableArea figura:
             figuras) {
            this.area += figura.getArea();
        }
    }

    @Override
    public double getArea() {
        return area;
    }

}
