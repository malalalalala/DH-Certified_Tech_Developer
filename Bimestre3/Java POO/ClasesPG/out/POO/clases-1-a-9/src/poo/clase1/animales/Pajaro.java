public class Pajaro {
    String nombre = "Gardel";
    int edad = 1;
    String cuantoCome = "350 gramos";
    String comoSeComunica = "Pio pio";

    public void mostrarDatos() {
        System.out.println("\n\tEl animal es un " + this.getClass().getSimpleName());
        System.out.println("\tSe llama " + nombre + " y tiene " + edad + " años");
        System.out.println("\tCome " + cuantoCome + " y se comunica: " + comoSeComunica);
    }
}
