package Clase6SincronicaRodoStreaming;

public class GrillaDePeliculasProxy implements IGrillaDePeliculas{
    private IP dirIP;
    private GrillaDePeliculas grilla;

    public GrillaDePeliculasProxy(IP dirIP, GrillaDePeliculas grilla) {
        this.dirIP = dirIP;
        this.grilla = grilla;
    }

    public IP getDirIP() {
        return dirIP;
    }

    public void setDirIP(IP dirIP) {
        this.dirIP = dirIP;
    }

    public GrillaDePeliculas getGrilla() {
        return grilla;
    }

    public void setGrilla(GrillaDePeliculas grilla) {
        this.grilla = grilla;
    }

    @Override
    public Pelicula getPelicula(String nombreDePelicula) throws PeliculaNoHabilitadaException {
        Pelicula peliculaEntrontrada=grilla.getPelicula(nombreDePelicula);
        //Filtro de datos
        String paisDeLaPelicula=peliculaEntrontrada.getPais();
        String paisDeOrigenSegunIP=dirIP.getPais();

        if(!paisDeLaPelicula.equals(paisDeOrigenSegunIP)){
            throw new PeliculaNoHabilitadaException(nombreDePelicula+"no disponible en" +paisDeOrigenSegunIP);
        }
        return peliculaEntrontrada;
    }
}
