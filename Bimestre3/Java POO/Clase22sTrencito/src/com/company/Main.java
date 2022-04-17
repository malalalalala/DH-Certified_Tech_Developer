package com.company;

import com.company.figuraCompuesta.FiguraCompuesta;
import com.company.figuras.Rectangulo;
import com.company.figuras.Triangulo;
import com.company.interfaz.Calculable;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    // figura Vagon

        Triangulo triangulo = new Triangulo(15.0,15.0);
        Rectangulo rectagulo = new Rectangulo(15.0,20.0);

        ArrayList<Calculable> figurasListVagon = new ArrayList<>();
        figurasListVagon.add(triangulo);
        figurasListVagon.add(rectagulo);

        FiguraCompuesta vagon = new FiguraCompuesta();
        vagon.agregarFiguras(figurasListVagon);

        // figura locomotora

        Triangulo triangulo1 = new Triangulo(15.0,15.0);
        Rectangulo rectagulo1 = new Rectangulo(15.0,20.0);
        Rectangulo rectagulo2 = new Rectangulo(15.0,20.0);

        ArrayList<Calculable> figurasListLocomotora = new ArrayList<>();
        figurasListLocomotora.add(triangulo1);
        figurasListLocomotora.add(rectagulo1);
        figurasListLocomotora.add(rectagulo2);

        FiguraCompuesta locomotora = new FiguraCompuesta();
        locomotora.agregarFiguras(figurasListLocomotora);

        System.out.println(vagon.calcularAreaTotal());
        System.out.println(locomotora.calcularAreaTotal());

    }
}
