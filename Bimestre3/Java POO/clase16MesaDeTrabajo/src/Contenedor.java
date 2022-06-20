import java.util.Objects;

public class Contenedor implements Comparable<Contenedor>{
    private int numeroContenedor;
    private String paisProcedencia;
    private Boolean materialesPeligrosos;

    public Contenedor(int numeroContenedor, String paisProcedencia, Boolean materialesPeligrosos) {
        this.numeroContenedor = numeroContenedor;
        this.paisProcedencia = paisProcedencia;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    public int getNumeroContenedor() {
        return numeroContenedor;
    }

    public boolean esPeligroso(){
        return this.materialesPeligrosos;
    }

    public boolean procedenciaDesconocida(){
        return this.paisProcedencia.equals("Desconocida");
    }
    @Override
    public int compareTo(Contenedor contenedor) {
        return this.numeroContenedor - contenedor.getNumeroContenedor();

    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "numeroContenedor=" + numeroContenedor +
                ", paisProcedencia='" + paisProcedencia + '\'' +
                ", materialesPeligrosos=" + materialesPeligrosos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contenedor that = (Contenedor) o;
        return numeroContenedor == that.numeroContenedor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroContenedor);
    }
}
