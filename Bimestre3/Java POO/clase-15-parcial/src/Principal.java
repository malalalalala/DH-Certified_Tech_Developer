import java.lang.String;
import java.lang.System;
/*
    Sobre la resolución:
        - Getters y setters:
            Decidí no incluir getters y setters más allá de los necesarios en el modelo planteado para la
            correcta interacción entre las clases (https://martinfowler.com/bliki/GetterEradicator.html).
            Entiendo que hay frameworks que los necesitan, pero ponerlos para todos los atributos rompe el
            encapsulamiento, al no utilizar ningún framework que los requiera decidí preservar la encapsulación.
       - Clase Persona:
            Entiendo por el enunciado que la clase debe quedar anémica al no especificarse responsabilidades.
            El uso que le di a la sobreescritura del método toString() no es el más habitual para cuando un
            framework lo utiliza, pero me pareció que servía para poder mostrar los datos de la persona de manera
            prolija.
*/

public class Principal {
    public static void main(String[] args) {
        Persona pepe = new Persona("Pepe", "Gomez", 35123456, 27);
        Persona pepa = new Persona("Pepa", "Gonzalez", 37123456, 25);
        Persona pipo = new Persona("Pipo", "Gutierrez", 30123456, 31);
        Titulo tituloPepe = new Terciario(24, "15/03/2017", "30/11/2020", true, false, pepe, "PROVINCIAL");
        Titulo tituloPepa = new Licenciatura(36, "03/04/2016", "14/12/2020", true, true, pepa, "Nuevas tecnologias y su impacto en el medio ambiente", "20/11/2020", 4);
        Titulo tituloPipo = new Licenciatura(36, "20/03/2012", "10/02/2019", true, true, pipo, "Impacto de las nuevas metodologias de trabajo", "20/11/2020", 8);
        Licenciatura licenciaturaPepa = (Licenciatura) tituloPepa;
        Licenciatura licenciaturaPipo = (Licenciatura) tituloPipo;

        tituloPepe.mostrarInformacion();
        System.out.println("\tPuede ejercer: " + (tituloPepe.puedeEjercer() ? "Sí" : "No"));
        System.out.println("\tEs valido a nivel nacional: " + (((Terciario) tituloPepe).esValidoNacionalmente() ? "Sí" : "No"));

        tituloPepa.mostrarInformacion();
        System.out.println("\tPuede ejercer: " + (tituloPepa.puedeEjercer() ? "Sí" : "No"));
        System.out.println("\tEl titulo de pepa es mayor al de pipo: " + (licenciaturaPepa.compareTo(licenciaturaPipo) == 1 ? "Sí" : "No"));

        tituloPipo.mostrarInformacion();
        System.out.println("\tPuede ejercer: " + (tituloPipo.puedeEjercer() ? "Sí" : "No"));
        System.out.println("\tEl titulo de pipo es mayor al de pepa: " + (licenciaturaPipo.compareTo(licenciaturaPepa) == 1 ? "Sí" : "No"));
    }
}