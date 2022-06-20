package Clase6SincronicaRodoStreaming;

public interface IGrillaDePeliculas {
    Pelicula getPelicula(String nombreDePelicula) throws PeliculaNoHabilitadaException;

}
