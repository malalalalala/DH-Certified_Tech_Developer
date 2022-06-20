package com.company.unidadesFuncionales;

public class FactoryUnidadFuncional {

        private static final int IMPUESTO_COCHERA = 10;
        private static final int IMPUESTO_DEPTO = 5;
        private static final int IMPUESTO_LOCAL = 15;
        private static final int IMPUESTO_SHOPPING = 35;
        private static final String CODIGO_COCHERA = "COCH";
        private static final String CODIGO_DEPTO = "DEPTO";
        private static final String CODIGO_LOCAL = "LOCAL";
        private static final String CODIGO_SHOPPING = "SHOP";

    public static UnidadFuncional crearUnidadFuncional(String direccion, String nombreDueño, double m2Totales, String codigo) throws FactoryUnidadFuncionalException {
        if(m2Totales>0)
        switch (codigo){
            case CODIGO_COCHERA:
                return new Cochera(direccion,nombreDueño,m2Totales,IMPUESTO_COCHERA);
            case CODIGO_DEPTO:
                return new Departamento(direccion,nombreDueño,m2Totales,IMPUESTO_DEPTO);
            case CODIGO_LOCAL:
                return new Local(direccion, nombreDueño, m2Totales, IMPUESTO_LOCAL);
            case CODIGO_SHOPPING:
                return new Shopping(direccion, nombreDueño, m2Totales, IMPUESTO_SHOPPING);
            default:
                throw new FactoryUnidadFuncionalException("El código: " + codigo + " no es válido");
        }
        throw new FactoryUnidadFuncionalException("Los m2 totales deben ser mayor a 0");
    }

}
