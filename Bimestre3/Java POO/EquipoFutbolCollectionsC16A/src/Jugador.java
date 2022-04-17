import java.util.Objects;

public class Jugador implements Comparable<Jugador>{
    private int nroCamiseta;
    private String nombre;
    private boolean lesionado;
    private boolean titular;

    public Jugador(int nroCamiseta, String nombre, boolean lesionado, boolean titular) {
        this.nroCamiseta = nroCamiseta;
        this.nombre = nombre;
        this.lesionado = lesionado;
        this.titular = titular;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    //con esto garantiza que cada vez que agrego está ordenado el jugador

    public boolean esTitular(){
        return this.titular;
    }

    @Override
    public int compareTo(Jugador jugador) {
        return this.nroCamiseta- jugador.getNroCamiseta();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return nombre.equals(jugador.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nroCamiseta=" + nroCamiseta +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public boolean estaLesionado() {
        return this.lesionado;
    }
}
