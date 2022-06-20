public class Licenciatura extends Titulo implements Comparable {

    private final String temaTesis;
    private final String fechaEntrega;
    private final int cdadInvestigaciones;

    public Licenciatura(int cantidadMaterias, String fechaInicioEstudios, String fechaFinalizacionEstudios,
                        boolean fueSelladoPorMinisterio, boolean fueSelladoPorInstituto, Persona persona,
                        String temaTesis, String fechaEntrega, int cdadInvestigaciones) {
        super(cantidadMaterias, fechaInicioEstudios, fechaFinalizacionEstudios, fueSelladoPorMinisterio, fueSelladoPorInstituto, persona);
        this.temaTesis = temaTesis;
        this.fechaEntrega = fechaEntrega;
        this.cdadInvestigaciones = cdadInvestigaciones;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("\nTitulo de licenciatura de:");
        System.out.println(getPersona().toString());
        System.out.println("\tEl tema de la tesis fue: \"" + this.temaTesis + "\" y la entregó el: " + this.fechaEntrega);
        super.mostrarInformacion();
    }

    @Override
    public int compareTo(Object o) {
        Licenciatura otraLicenciatura = (Licenciatura) o;
        int resultado = 0;
        if (this.cdadInvestigaciones > otraLicenciatura.cdadInvestigaciones) {
            resultado = 1;
        } else if (this.cdadInvestigaciones < otraLicenciatura.cdadInvestigaciones) {
            resultado = -1;
        }
        return resultado;
    }
}