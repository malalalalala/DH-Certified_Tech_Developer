public class Main {

    public static void main(String[] args) {
        Alumno alumnoMarta=new Alumno("Marta","Caillava", "13214");
        Parcial poo=new Parcial(alumnoMarta, "java", "intro", "tu vieja", 10.00, 3, 1);
    }

    System.out.println(poo);
}
