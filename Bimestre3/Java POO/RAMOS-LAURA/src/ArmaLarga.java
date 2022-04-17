public class ArmaLarga extends Arma implements Comparable{
    private boolean tieneSelloRenar;
    private String descripcion;
    private int nivel;


    public ArmaLarga(Policia policia, int cantidadMuniciones, double alcanceEnMetros, String marca, double calibre, String estado, boolean tieneSelloRenar, String descripcion, int nivel) {
        super(policia, cantidadMuniciones, alcanceEnMetros, marca, calibre, estado);
        this.tieneSelloRenar = tieneSelloRenar;
        this.descripcion = descripcion;
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }


    @Override
    public int compareTo(Object o) {
        return this.nivel - ((ArmaLarga)o).getNivel();
    }
}
