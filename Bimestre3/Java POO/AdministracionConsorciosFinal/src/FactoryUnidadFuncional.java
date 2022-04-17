public class FactoryUnidadFuncional {
    private static final double IMPUESTO_COCHERA=10;
    private static final String CODIGO_COCHERA="COCH";
    private static final double IMPUESTO_DEPARTAMENTO=5;
    private static final String CODIGO_DEPARTAMENTO="DEPTO";
    private static final double IMPUESTO_LOCAL=15;
    private static final String CODIGO_LOCAL="LOCAL";
    private static final double IMPUESTO_SHOPPING=35;
    private static final String CODIGO_SHOPPING="SHOP";

    public static UnidadFuncional crearUnidadFuncional(String codigo,String direccion, String duenio, double metrosCuadrados, double valorMetroCuadrado) throws CodigoUnidadFuncionalException {
       return switch (codigo){
            case CODIGO_COCHERA -> new Cochera(direccion,duenio,metrosCuadrados,IMPUESTO_COCHERA,valorMetroCuadrado);
            case CODIGO_DEPARTAMENTO -> new Departamento(direccion,duenio,metrosCuadrados,IMPUESTO_DEPARTAMENTO,valorMetroCuadrado);
            case CODIGO_LOCAL -> new Local(direccion,duenio,metrosCuadrados,IMPUESTO_LOCAL,valorMetroCuadrado);
            case CODIGO_SHOPPING -> new Shopping(direccion,duenio,metrosCuadrados,IMPUESTO_SHOPPING,valorMetroCuadrado);
            default -> throw new CodigoUnidadFuncionalException("Código ingresado es inválido");
        };

    }

}
