public abstract class Titulo {

    private int cantidadMaterias;
    private String fechaInicioEstudios;
    private String fechaFinalizacionEstudios;
    private boolean fueSelladoPorMinisterio;
    private boolean fueSelladoPorInstituto;
    private Persona persona;

    public Titulo(int cantidadMaterias, String fechaInicioEstudios, String fechaFinalizacionEstudios,
                  boolean fueSelladoPorMinisterio, boolean fueSelladoPorInstituto, Persona persona) {
        this.cantidadMaterias = cantidadMaterias;
        this.fechaInicioEstudios = fechaInicioEstudios;
        this.fechaFinalizacionEstudios = fechaFinalizacionEstudios;
        this.fueSelladoPorMinisterio = fueSelladoPorMinisterio;
        this.fueSelladoPorInstituto = fueSelladoPorInstituto;
        this.persona = persona;
    }

    public String getFechaInicioEstudios() {
        return fechaInicioEstudios;
    }

    public String getFechaFinalizacionEstudios() {
        return fechaFinalizacionEstudios;
    }

    public boolean isFueSelladoPorMinisterio() {
        return fueSelladoPorMinisterio;
    }

    public boolean isFueSelladoPorInstituto() {
        return fueSelladoPorInstituto;
    }

    public int getCantidadMaterias() {
        return cantidadMaterias;
    }

    public Persona getPersona() {
        return persona;
    }

    public boolean puedeEjercer() {
        return this.fueSelladoPorMinisterio && this.fueSelladoPorInstituto;
    }

    public void mostrarInformacion() {
        System.out.println("\tInicio estudios: " + getFechaInicioEstudios());
        System.out.println("\tFin estudios: " + getFechaFinalizacionEstudios());
        System.out.println("\tCantidad de materias: " + getCantidadMaterias());
        System.out.println("\tTiene sello del instituto: " + (isFueSelladoPorInstituto() ? "Sí" : "No"));
        System.out.println("\tTiene sello del ministerio: " + (isFueSelladoPorMinisterio() ? "Sí" : "No"));
    }
}