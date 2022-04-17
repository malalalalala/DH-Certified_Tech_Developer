public class Perro extends AnimalClase11A {

    public Perro(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerRuido() {
        System.out.println("guau");
    }
}
