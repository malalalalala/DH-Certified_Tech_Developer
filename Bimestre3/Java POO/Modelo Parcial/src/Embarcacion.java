public abstract class Embarcacion {
    private Capitan capitan;
    private int anioFabricacion;
    private double eslora;
    private double valorBase;
    private double valorAdicional;

    private static final int EMBARCACION_NUEVA=2020;

    public Embarcacion(Capitan capitan, int anioFabricacion, double eslora, double valorBase, double valorAdicional) {
        this.capitan = capitan;
        this.anioFabricacion = anioFabricacion;
        this.eslora = eslora;
        this.valorBase = valorBase;
        this.valorAdicional = valorAdicional;
    }

    public double calcularValorAlquiler(){
         double valorAlquiler = valorBase;
        if(anioFabricacion<EMBARCACION_NUEVA){
           valorAlquiler+=valorAdicional;
        }
        return valorAlquiler;
    }
}
