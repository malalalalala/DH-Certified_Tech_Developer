package poo.varela;

public class FabricaDeServicios {

    private static FabricaDeServicios instancia;

    private FabricaDeServicios() {}

    public static FabricaDeServicios obtenerInstancia() {
        if (instancia == null)
            instancia = new FabricaDeServicios();
        return instancia;
    }

    public Servicio crearOfertaAcademica(String tipo) {
        switch (tipo) {
            case "simple":
                return new ServicioSimple();
            case "combo":
                return new Combo();
            default:
                throw new TipoDeServicioIncorrectoException("El tipo de servicio: \"" + tipo + "\" es invalido");
        }
    }
}
