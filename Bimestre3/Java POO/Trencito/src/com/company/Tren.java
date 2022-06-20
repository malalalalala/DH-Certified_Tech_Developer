package com.company;

import java.util.List;

public class Tren implements CalculableArea {
    private List<CalculableArea> coches;
    private double area;

    public Tren(List<CalculableArea> coches) {
        this.coches = coches;
    }

    private void setArea(){
        this.area = 0;
        for (CalculableArea coche:
                coches
             ) {
            area+= coche.getArea();
        }
    }
    @Override
    public double getArea(){
        return area;
    }
}
