public class Gato {
    String nombre = "Silvestre";
    int edad = 3;
    String cuantoCome = "medio kilo";
    String comoSeComunica = "Miau miau";

    public void mostrarDatos() {
        System.out.println("\n\tEl animal es un " + this.getClass().getSimpleName());
        System.out.println("\tSe llama " + nombre + " y tiene " + edad + " años");
        System.out.println("\tCome " + cuantoCome + " y se comunica: " + comoSeComunica);
    }
}
