import java.util.HashSet;
import java.util.Set;

public class  FactoryHabilidad {
    public static Simple crearHabilidadSimple(String nombre, String descripcion, double puntaje){
        return new Simple(nombre, descripcion, puntaje);
    }
    public static Combinada crearHabilidadCombinada(String nombre, String descripcion, int multiplicador, Set<Simple> habilidadesSimples){
        return new Combinada(nombre, descripcion, multiplicador, habilidadesSimples);
    }




}