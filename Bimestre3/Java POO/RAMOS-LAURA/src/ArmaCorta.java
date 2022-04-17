public class ArmaCorta extends Arma{
    private boolean automatica;
    private static final double ALCANCE_MINIMO_DISPARO = 200;

    public ArmaCorta(Policia policia, int cantidadMuniciones, double alcanceEnMetros, String marca, double calibre, String estado, boolean automatica) {
        super(policia, cantidadMuniciones, alcanceEnMetros, marca, calibre, estado);
        this.automatica = automatica;
    }

    public boolean sePuedeDispararADistanciaMinima()
    {
        return super.getAlcanceEnMetros() > ALCANCE_MINIMO_DISPARO;
    }
}
