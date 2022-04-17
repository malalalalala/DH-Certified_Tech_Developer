public class MainAnimal {
    public static void main(String[] args) {
        AnimalClase11A animal=new Perro("firulais",5);
        animal.hacerRuido();
        AnimalClase11A animal2=new Gato("michi",5);
        animal2.hacerRuido();
        animal=new Gato("karen",2);
        animal.hacerRuido();
    }
}
