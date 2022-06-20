package ClaseAsincrónicaCancionesJuanCarlos;

import java.util.HashMap;
import java.util.Map;

public class ListaReproduccion {
    private String nombre;
    private Map<String, Cancion> lista;

    public ListaReproduccion(String nombre, Map<String, Cancion> lista) {
        this.nombre = nombre;
        lista = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  Map<String, Cancion> getLista() {
        return lista;
    }

    public void setLista(Map<String, Cancion> lista) {
        this.lista = lista;
    }

    public void agregarCancion(String nombre, Cancion cancion){
        lista.put(nombre,cancion);

    }


}
