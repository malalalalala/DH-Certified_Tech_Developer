import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Simple disparar=FactoryHabilidad.crearHabilidadSimple("disparar","disparar",10);

        Simple saltar=FactoryHabilidad.crearHabilidadSimple("saltar","saltar",7.5);

        Set<Simple> habilidadesSimplesParaCombinada=new HashSet<>();

        habilidadesSimplesParaCombinada.add(disparar);
        habilidadesSimplesParaCombinada.add(saltar);

        Combinada disparoAlSaltar=FactoryHabilidad.crearHabilidadCombinada("Disparo-al-saltar","hola",3,habilidadesSimplesParaCombinada);

        Personaje mario=new Personaje();

        mario.agregarHabilidad(disparar);
        mario.agregarHabilidad(saltar);
        mario.agregarHabilidad(disparoAlSaltar);

mario.mostrarHabilidades();

    }
}
