public class Contenedor implements Comparable<Contenedor>{
    private int numeroId;
    private String pais;
    private boolean materialesPeligrosos;

    public Contenedor(int numeroId, String pais, boolean materialesPeligrosos) {
        this.numeroId = numeroId;
        this.pais = pais;
        this.materialesPeligrosos = materialesPeligrosos;
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "numero='" + numeroId + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }

    @Override
    public int compareTo(Contenedor contenedor) {
        return this.numeroId-contenedor.getNumeroId();
    }

    private int getNumeroId() {
        return this.numeroId;
    }

    public String getPais() {
        return this.pais;
    }

    public boolean getMaterialesPeligrosos() {
        return this.materialesPeligrosos;
    }
}
