package com.company;

import com.company.administracion.Administracion;
import com.company.unidadesFuncionales.*;

public class Main {
    public static void main(String[] args) throws FactoryUnidadFuncionalException {

        Administracion admin1 = new Administracion();

        UnidadFuncional l1 = FactoryUnidadFuncional.crearUnidadFuncional("A 123", "Ave", 50, "LOCAL");
        UnidadFuncional l2 = FactoryUnidadFuncional.crearUnidadFuncional("B 456", "Bea", 200, "LOCAL");
        UnidadFuncional l3 = FactoryUnidadFuncional.crearUnidadFuncional("C 789", "Cecilia", 30, "LOCAL");
        UnidadFuncional shopping = FactoryUnidadFuncional.crearUnidadFuncional("D 1000", "Denzel", 1, "SHOP");



        admin1.mostrarUnidadesFuncionales();

        Shopping shopping1= (Shopping) shopping;
        shopping1.agregarLocal(l1);
        shopping1.agregarLocal(l2);
        admin1.agregarUnidadFuncional(shopping1);

        admin1.agregarUnidadFuncional(l3);

        admin1.mostrarUnidadesFuncionales();
    }
}
