public class Perro {
    String nombre = "Manchitas";
    int edad = 2;
    String cuantoCome = "un kilo y medio";
    String comoSeComunica = "Guau guau";

    public void mostrarDatos() {
        System.out.println("\n\tEl animal es un " + this.getClass().getSimpleName());
        System.out.println("\tSe llama " + nombre + " y tiene " + edad + " años");
        System.out.println("\tCome " + cuantoCome + " y se comunica: " + comoSeComunica);
    }
}
