public class Pez {
    String nombre = "Nemo";
    int edad = 1;
    String cuantoCome = "140 gramos";
    String comoSeComunica = "Glup glup";

    public void mostrarDatos() {
        System.out.println("\n\tEl animal es un " + this.getClass().getSimpleName());
        System.out.println("\tSe llama " + nombre + " y tiene " + edad + " años");
        System.out.println("\tCome " + cuantoCome + " y se comunica: " + comoSeComunica);
    }
}
