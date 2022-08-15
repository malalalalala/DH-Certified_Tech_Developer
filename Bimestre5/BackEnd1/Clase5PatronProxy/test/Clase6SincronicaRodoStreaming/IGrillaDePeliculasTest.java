package Clase6SincronicaRodoStreaming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IGrillaDePeliculasTest {
    @Test
    public void peliculaDisponible(){
        IP direccion=new IP(30,57,98,21);
        GrillaDePeliculasProxy proxy= new GrillaDePeliculasProxy(direccion,new GrillaDePeliculas());
        String respEsperada="www.tuspelis.com/peli1";
        try{
            assertEquals(respEsperada,proxy.getPelicula("Peli1").getLink());
        }catch (PeliculaNoHabilitadaException e){
            System.out.println(e.getMessage());
        }

    }

}