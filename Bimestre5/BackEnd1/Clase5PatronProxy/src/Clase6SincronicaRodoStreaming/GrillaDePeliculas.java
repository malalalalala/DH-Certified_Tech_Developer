package Clase6SincronicaRodoStreaming;

public class GrillaDePeliculas implements IGrillaDePeliculas{
    @Override
    public Pelicula getPelicula(String nombreDePelicula) {
        //es como si fueramos a buscar en una basa de datos
        Pelicula pelicula=null;

        switch (nombreDePelicula){
                case "Peli1":
                pelicula=new Pelicula("Peli1","Argentina","www.tuspelis.com/peli1");
                    break;
                case "Peli2":
                pelicula=new Pelicula("Peli2","Brasil","www.tuspelis.com/peli2");
                    break;
                case "Peli3":
                pelicula=new Pelicula("Peli3","Colombia","www.tuspelis.com/peli3");
                    break;
                case "Peli4":
                    System.out.println("entré"+nombreDePelicula);
                pelicula=new Pelicula("Peli4","Argentina","www.tuspelis.com/peli4");
                break;
        }
        return pelicula;
    }
}
