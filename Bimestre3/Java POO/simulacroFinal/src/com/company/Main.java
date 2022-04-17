package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Curso front = FactoryOfertasAcademicas.crearCurso("Front end", "Cualquier descripcion", 16, 2, 1000);
        Curso back = FactoryOfertasAcademicas.crearCurso("Back end", "Cualquier descripcion", 20, 2, 900);
        Set<Curso> cursosParaFullStack = new HashSet<>();
        cursosParaFullStack.add(front);
        cursosParaFullStack.add(back);
        OfertaAcademica fullStack = FactoryOfertasAcademicas.crearPrograma("Full stack", "cualquier descirpcion", 20, cursosParaFullStack);
        Instituto dh = new Instituto();
        dh.agregarOfertaAcademica(fullStack);
        dh.agregarOfertaAcademica(front);
        dh.agregarOfertaAcademica(back);
        dh.generarInforme();
    }
}
