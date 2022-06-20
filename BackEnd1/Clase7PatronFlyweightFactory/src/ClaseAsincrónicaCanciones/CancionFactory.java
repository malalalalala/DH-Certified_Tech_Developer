package ClaseAsincrónicaCanciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CancionFactory {


    private static final HashMap<String, Cancion> ListaReproducción = new HashMap<>();

    public static Cancion validarCancion(final String nombre) {
        Cancion cancion = ListaReproducción.get(nombre);
        if (Objects.isNull(cancion)){
            cancion = new Cancion(nombre);
            ListaReproducción.put(nombre,cancion);
            System.out.println("Creando la cancion"+nombre);
            return cancion;
        }
        System.err.println("la cancion " + nombre +" ya se encuentra en la lista de reproducción");
        return cancion;


    }


}
