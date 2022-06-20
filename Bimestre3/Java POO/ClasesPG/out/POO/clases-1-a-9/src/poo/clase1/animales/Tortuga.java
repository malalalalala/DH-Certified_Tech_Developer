public class Tortuga {
    String nombre = "Manuelita";
    int edad = 12;
    String cuantoCome = "300 gramos";
    String enDondeVivia = "Pehuajó";

    public void mostrarDatos() {
        System.out.println("\n\tEl animal es un " + this.getClass().getSimpleName());
        System.out.println("\tSe llama " + nombre + " y tiene " + edad + " años");
        System.out.println("\tCome " + cuantoCome + " y se vivia en " + enDondeVivia);
    }
}
