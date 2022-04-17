import java.util.List;

public class FactoryTiposDeCargas {

    private static final double FACTOR_INCREMENTO_PESO=1.1;
    private static final double FACTOR_DECREMENTO_PESO=0.9;
    private static final String CODIGO_SLW="SLW-123";
    private static final String CODIGO_FST="FST-456";


public static Simple crearCargaSimple(String nombre, double pesoCarga,String codigo) throws CodigoCargaSimpleExcepcion {
    return switch (codigo){
        case CODIGO_SLW -> new Simple(nombre,pesoCarga,FACTOR_INCREMENTO_PESO);
        case CODIGO_FST -> new Simple(nombre, pesoCarga, FACTOR_DECREMENTO_PESO);
        default ->throw new CodigoCargaSimpleExcepcion("Código ingresado es inválido");
    };
}

public static Contenedor crearContenedor(String nombre, double pesoPropioContenedor,List<Simple> cargasSimples){
    return new Contenedor(nombre, pesoPropioContenedor, cargasSimples);
}

}
