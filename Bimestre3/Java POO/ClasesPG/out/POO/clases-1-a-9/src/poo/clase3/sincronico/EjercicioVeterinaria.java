import java.util.Scanner;

public class EjercicioVeterinaria {

    public static String pedirNombrePerro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar el nombre del perro: ");
        return scanner.nextLine();
    }

    public static double pedirCdadComidaPerro(String nombre) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar la cantidad de comida (en kg) que come " + nombre + " : ");
        return scanner.nextDouble();
    }

    public static double cuantosPaquetes(double cdadComidaPerro) {
        Scanner scanner = new Scanner(System.in);
        double cdadPaquetes = 0;
        while (cdadComidaPerro > 0) {
            System.out.println("Ingresar el peso (en kg) del siguiente paquete: ");
            double pesoPaquete = scanner.nextDouble();

            if (pesoPaquete > cdadComidaPerro) {
                cdadPaquetes += cdadComidaPerro / pesoPaquete;
            } else {
                cdadPaquetes++;
            }
            cdadComidaPerro -= pesoPaquete;
        }
        return cdadPaquetes;
    }

}
