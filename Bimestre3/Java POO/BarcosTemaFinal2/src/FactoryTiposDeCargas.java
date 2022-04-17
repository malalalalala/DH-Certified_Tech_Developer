import java.util.List;

public class FactoryTiposDeCargas {
    public static CargaSimple crearCargaSimple(String nombre, String descripcion, double pesoCarga, boolean refrigeracion){
        return new CargaSimple(nombre,descripcion,pesoCarga,refrigeracion);
    }
    public static Contenedor crearContenedor(String nombre, String descripcion, double pesoPropioContenedor, List<CargaSimple> cargasSimples){
        return new Contenedor(nombre,descripcion,pesoPropioContenedor,cargasSimples);
    }
}
