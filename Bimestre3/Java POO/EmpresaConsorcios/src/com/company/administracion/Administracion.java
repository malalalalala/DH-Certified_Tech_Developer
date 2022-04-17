package com.company.administracion;


import com.company.unidadesFuncionales.UnidadFuncional;

import java.util.ArrayList;
import java.util.List;

public class Administracion {
    public static final double PRECIO_M2 = 100;
    private List<UnidadFuncional> unidadesFuncionales;

    public void agregarUnidadFuncional(UnidadFuncional unidadFuncional){
        this.unidadesFuncionales.add(unidadFuncional);
    }

    public void mostrarUnidadesFuncionales(){
        for (UnidadFuncional unidadFuncional: this.unidadesFuncionales) {
            System.out.println(unidadFuncional);
        }
    }

    public Administracion() {
        this.unidadesFuncionales = new ArrayList();
    }
}
