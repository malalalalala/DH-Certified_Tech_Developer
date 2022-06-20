public class Terciario extends Titulo {

    private final String valdacion;

    public Terciario(int cantidadMaterias, String fechaInicioEstudios, String fechaFinalizacionEstudios, boolean fueSelladoPorMinisterio, boolean fueSelladoPorInstituto, Persona persona, String valdacion) {
        super(cantidadMaterias, fechaInicioEstudios, fechaFinalizacionEstudios, fueSelladoPorMinisterio, fueSelladoPorInstituto, persona);
        this.valdacion = valdacion;
    }

    public boolean esValidoNacionalmente() {
        return this.valdacion == "NACIONAL";
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\nTitulo terciario de:");
        System.out.println(getPersona().toString());
        System.out.println("\tCon validez: " + this.valdacion);
        super.mostrarInformacion();
    }
}