package puertos;

import java.util.Set;
import java.util.TreeSet;

public class Puerto {
private Set<Contenedores> contenedores;

    public Puerto() {
        this.contenedores = new TreeSet<>();
    }

    public void  agregarContenedores(Contenedores contenedor){
        this.contenedores.add(contenedor);
    }

    public void mostrarContenedores() {
        for (Contenedores contenedor: contenedores ) {
            System.out.println(contenedor);


        }
    }

    public int contenedoresPeligrosos() {
        int total = 0;

        for (Contenedores contenedor: contenedores ) {
            if(contenedor.isTrasportaMaterialPeligroso() && contenedor.getPais().equals("Desconocida") ) {
                total++;


        }

    }
        return total;}
}
