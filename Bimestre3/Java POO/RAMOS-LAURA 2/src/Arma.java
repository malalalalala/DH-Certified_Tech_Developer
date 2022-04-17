public abstract class Arma {
    private Policia policia;//
    private int cantidadMuniciones;//
    private double alcanceEnMetros;//
    private String marca;//
    private double calibre;//
    private String estado;//
    private static final double CALIBRE_MINIMO_PARA_USAR_ENFRENTAMIENTO=9;
    private static final String ESTADO_PARA_USAR_ENFRENTAMIENTO="EN USO";

    public Arma(Policia policia, int cantidadMuniciones, double alcanceEnMetros, String marca, double calibre, String estado) {
        this.policia = policia;
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanceEnMetros = alcanceEnMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    public double getAlcanceEnMetros() {
        return alcanceEnMetros;
    }

    public double getCalibre() {
        return calibre;
    }

    public String getEstado() {
        return estado;
    }

    public boolean usarEnEnfrentamiento(){
        return  this.getCalibre()>=CALIBRE_MINIMO_PARA_USAR_ENFRENTAMIENTO && this.getEstado().equals(ESTADO_PARA_USAR_ENFRENTAMIENTO);
    }


}
