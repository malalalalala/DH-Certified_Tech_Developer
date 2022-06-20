package puertos;

public class Contenedores implements Comparable<Contenedores> {
    private int identificacion;
    private String pais;
    private boolean trasportaMaterialPeligroso;

    public Contenedores(int identificacion, String pais, boolean trasportaMaterialPeligroso) {
        this.identificacion = identificacion;
        this.pais = pais;
        this.trasportaMaterialPeligroso = trasportaMaterialPeligroso;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public String getPais() {
        return pais;
    }

    public boolean isTrasportaMaterialPeligroso() {
        return trasportaMaterialPeligroso;
    }

    @Override
    public int compareTo(Contenedores o) {
        return this.identificacion - o.getIdentificacion();
    }


    @Override
    public String toString() {
        return "Contenedores{" +
                "identificacion=" + identificacion +
                ", pais='" + pais + '\'' +
                ", trasportaMaterialPeligroso=" + trasportaMaterialPeligroso +
                '}';
    }
}
