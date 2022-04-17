import java.util.HashSet;
import java.util.Set;

public class Personaje {
    private Set<Habilidad> habilidades;

    public Personaje() {
        this.habilidades = new HashSet<>();
    }

    public void agregarHabilidad(Habilidad habilidad){
        this.habilidades.add(habilidad);
    }

    public void mostrarHabilidades(){
        for (Habilidad habilidad: this.habilidades) {
            System.out.println(habilidad);
        }
    }
}