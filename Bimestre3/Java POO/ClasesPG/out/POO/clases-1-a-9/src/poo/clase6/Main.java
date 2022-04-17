import poo.clase6.mesaDeTrabajo.Perro;
import Impresora;


public class Main {

    public static void main(String[] args) {
        probarPerro();
    }

    public static void probarImpresora() {
        Impresora impresora = new Impresora("ImpreMax", "WiFi", 500);
        System.out.println("\tModelo impresora: " + impresora.getModelo());
        impresora.encender();
        System.out.println("\tHojas disponibles: " + impresora.getHojasDisponibles());
        impresora.cargarHojas(1000);
        impresora.cargarHojas(250);
        System.out.println("\tHojas disponibles: " + impresora.getHojasDisponibles());
        impresora.imprimir("Texto de prueba");
        System.out.println("\tHojas disponibles: " + impresora.getHojasDisponibles());
        impresora.apagar();
    }

    public static void probarPerro() {
        Perro pepe = new Perro(false, 5.5, "Pepe");
        System.out.println("\nEl perro " + pepe.getNombre() + " pesa " + pepe.getPeso());
        pepe.mostrarEdad();
        pepe.ponerEnAdopcion();
        pepe.mostrarPuedePerderse();

        System.out.println("\n------------------------------------\n");

        Perro pepa = new Perro("Labrador", false, 2014, 5.3, false, false, "Pepa");
        System.out.println("El perro " + pepa.getNombre() + " pesa " + pepa.getPeso());
        pepa.mostrarEdad();
        pepa.ponerEnAdopcion();
        pepa.mostrarPuedePerderse();
    }
}
