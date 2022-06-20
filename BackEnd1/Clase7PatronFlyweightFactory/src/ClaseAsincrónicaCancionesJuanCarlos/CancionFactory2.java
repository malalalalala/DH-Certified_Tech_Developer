package ClaseAsincrónicaCancionesJuanCarlos;

import java.util.HashMap;
import java.util.Objects;

public class CancionFactory2 {
    private String nombre;


    private HashMap<String, Cancion> listaReproduccin = new HashMap<>();

    public CancionFactory2(String nombre) {
        this.nombre = nombre;
    }

    public Cancion validarCancion(final String nombre) {
        Cancion cancion = listaReproduccin.get(nombre);
        if (Objects.isNull(cancion)){
            cancion = new Cancion(nombre);
            listaReproduccin.put(nombre,cancion);
            System.out.println("Creando la cancion: "+nombre);
            return cancion;
        }
        System.err.println("la cancion "+cancion.getNombre()+ " ya estaba agragada");
        return cancion;


    }

    public HashMap<String, Cancion> getListaReproduccin() {
        return listaReproduccin;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
