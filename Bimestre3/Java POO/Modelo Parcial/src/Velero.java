public class Velero extends Embarcacion{
    private int mastiles;
    private static final int MASTILES_EMBARCACION_PEQUENIA=4;

    public Velero(Capitan capitan, int anioFabricacion, double eslora, double valorBase, double valorAdicional, int mastiles) {
        super(capitan, anioFabricacion, eslora, valorBase, valorAdicional);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public boolean veleroEsGrande(){
        return this.getMastiles()>MASTILES_EMBARCACION_PEQUENIA;
    }
}
