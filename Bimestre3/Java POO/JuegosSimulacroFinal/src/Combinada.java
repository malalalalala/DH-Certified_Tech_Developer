
import java.util.Set;

public class Combinada extends Habilidad{
    private int multiplicador;
    private Set<Simple> habilidadesSimples;

    public Combinada(String nombre, String descripcion, int multiplicador, Set<Simple> habilidadesSimples) {
        super(nombre, descripcion);
        this.multiplicador = multiplicador;
        this.habilidadesSimples = habilidadesSimples;
    }

    @Override
    public double calcularPuntaje() {
        double puntajeTotal = 0;
        for (Simple habilidadSimple : habilidadesSimples) {
            puntajeTotal += habilidadSimple.calcularPuntaje();
        }
        return puntajeTotal * this.multiplicador;
    }

    @Override
    public String toString() {
        return getNombre() + " tiene " +
                "puntaje=" + calcularPuntaje() +
                '}';
    }

}
