import java.util.Set;
import java.util.TreeSet;

public class Puerto {
    private String nombre;
    private Set<Contenedor> contenedores;

    public Puerto(String nombre) {
        this.nombre = nombre;
        this.contenedores = new TreeSet<>() {
        };
    }

    public void agregarContenedor(Contenedor contenedor) {
        this.contenedores.add(contenedor);
    }

    public void mostrarContenedores() {
        for (Contenedor contenedor : this.contenedores) {
            System.out.println(contenedor);
        }
    }
    public int contarContenedoresPeligrosos() {
        int total = 0;
        for (Contenedor contenedor : this.contenedores) {
            if (contenedor.esPeligroso() && contenedor.procedenciaDesconocida()) {
                total++;
            }
        }
        return total;
    }

}

