package com.company.figuraCompuesta;
import com.company.interfaz.Calculable;
import java.util.ArrayList;
import java.util.List;

public class FiguraCompuesta implements Calculable {

    private List<Calculable> figuras;
    double sumaTotalAreas = 0;

    public FiguraCompuesta() {
        this.figuras = new ArrayList<>();
    }

    public void agregarFiguras(ArrayList figura){
        for (Object figuraSimple: figura) {
            this.figuras.add((Calculable) figuraSimple);
        }

    }

    @Override
    public double calcularAreaTotal() {
        for (Calculable figura: figuras) {
            sumaTotalAreas += figura.calcularAreaTotal();
        }
        return sumaTotalAreas;
    }

}
