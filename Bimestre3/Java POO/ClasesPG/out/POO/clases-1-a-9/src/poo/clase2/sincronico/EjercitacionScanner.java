import java.util.Scanner;

public class EjercitacionScanner {

    //    Ingresa tu nombre y tu apellido por separado, a partir de estas variables obtener en una
    //    tercera tus iniciales y tu fecha de nacimiento, para la fecha ingresa, 3 valores que
    //    representan día, mes y año.
    //    Luego muestra un mensaje, como si fuera una ficha, con tu nombre completo. Las iniciales
    //    de tu nombre y apellido y tu fecha de nacimiento con el formato “dd/mm/aaaa”
    public static void pedirYMostrarDatosUsuario() {
        String nombre, apellido;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\tIngresá tu nombre: ");
        nombre = scanner.nextLine();

        System.out.println("\tIngresá tu apellido: ");
        apellido = scanner.nextLine();

        System.out.println("\n\tNombre:\t" + nombre + "\t\tApellido:\t" + apellido);
        System.out.println("\tIniciales:\t" + nombre.charAt(0) + "." + apellido.charAt(0) + ".");
        System.out.println(pedirFechaNacimiento());
    }

    private static String pedirFechaNacimiento() {
        Scanner scanner = new Scanner(System.in);
        int diaNacimiento, mesNacimiento, anioNacimiento;
        do {
            System.out.println("\tIngresá el día de tu nacimiento: ");
            diaNacimiento = scanner.nextInt();
        } while(diaNacimiento < 1 || diaNacimiento > 31);

        do {
            System.out.println("\tIngresá el mes de tu nacimiento: ");
            mesNacimiento = scanner.nextInt();
        } while(mesNacimiento < 1 || diaNacimiento > 12);

        do {
            System.out.println("\tIngresá el año de tu nacimiento: ");
            anioNacimiento = scanner.nextInt();
        } while(anioNacimiento < 1 || anioNacimiento > 2021);
        return "\tNacimiento:\t" + diaNacimiento + "/" + mesNacimiento + "/" + anioNacimiento;
    }
}
