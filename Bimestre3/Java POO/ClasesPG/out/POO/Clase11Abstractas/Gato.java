public class Gato extends AnimalClase11A{

    public Gato(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("miau");
    }
}
