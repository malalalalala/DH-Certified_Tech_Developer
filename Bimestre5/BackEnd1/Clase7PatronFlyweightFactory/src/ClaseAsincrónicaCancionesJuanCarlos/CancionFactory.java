package ClaseAsincrónicaCancionesJuanCarlos;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CancionFactory {


    private HashMap<String, Cancion> listar = new HashMap<>();

    private ListaReproduccion listaReproduccin = new ListaReproduccion("",listar);

    public Cancion validarCancion(final String nombre) {
        Map<String,Cancion> lista;
        Cancion cancion = listar.get(nombre);
        if (Objects.isNull(cancion)){
            cancion = new Cancion(nombre);
            listar.put(nombre,cancion);
            System.out.println("Creando la cancion"+nombre);
            return cancion;
        }
        System.err.println("la cancion "+cancion.getNombre()+ " ya estaba agragada");
        return cancion;


    }

    public ListaReproduccion getListaReproduccin() {
        return listaReproduccin;
    }

    public HashMap<String, Cancion> getListar() {
        return listar;
    }

    public void setListar(HashMap<String, Cancion> listar) {
        this.listar = listar;
    }

    public void setListaReproduccin(ListaReproduccion listaReproduccin) {
        this.listaReproduccin = listaReproduccin;
    }

    @Override
    public String toString() {
        return "CancionFactory{" +super.toString()+
                "listar=" + listar +
                ", listaReproduccin=" + listaReproduccin +
                '}';
    }
}
