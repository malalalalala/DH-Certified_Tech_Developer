package poo.varela;

public class FabricaDeOfertaAcademica {

    private static FabricaDeOfertaAcademica instancia;

    private FabricaDeOfertaAcademica() {}

    public static FabricaDeOfertaAcademica obtenerInstancia() {
        if (instancia == null)
            instancia = new FabricaDeOfertaAcademica();
        return instancia;
    }

    public OfertaAcademica crearOfertaAcademica(String tipo) {
        switch (tipo) {
            case "programa":
                return new ProgramaIntensivo();
            case "curso":
                return new Curso();
            case "taller":
                return new Taller();
            case "carrera":
                return new Carrera();
            default:
                throw new IllegalStateException("El tipo de oferta: \"" + tipo + "\" es invalida");
        }
    }
}
