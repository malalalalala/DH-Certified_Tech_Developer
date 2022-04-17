package ejercicios_resueltos;

public class Clase1 {
    public static void main(String[] args) {

//        Ejercicio
//        Para representar cada una de las características de las mascotas, crear una variable y darle
//        el valor correspondiente en el IDE IntelliJ. No olvidar darle el tipo adecuado a lo que
//        queremos que contenga. Por cada mascota de la veterinaria que figura en la siguiente
//        tabla, vamos a tener que mostrar la información del animal. La información va a mostrarse
//        como el siguiente ejemplo:
            //“Manchitas tiene 2 años”
            //“Manchitas come un kilo y medio y hace guau guau”

        //Manchitas
        String nombreManchitas = "Manchitas";
        int edadManchitas = 2;
        float kilosQueComeManchitas = 1.5F;
        String ladridoManchitas = "Guau!";

        System.out.println(nombreManchitas + " tiene " + edadManchitas + " años.");
        System.out.println(nombreManchitas + " come " + kilosQueComeManchitas + " kilos y hace " + ladridoManchitas);

        System.out.println("----------------");

        //Nemo
        String nombreNemo = "Nemo";
        int edadNemo = 1;
        float kilosQueComeNemo = 0.14F;
        String sonidoNemo = "Blup";

        System.out.println(nombreNemo + " tiene " + edadNemo + " años.");
        System.out.println(nombreNemo + " come " + kilosQueComeNemo + " kilos y hace " + sonidoNemo + ".");

        System.out.println("----------------");

        //Silvestre
        String nombreSilvestre = "Silvestre";
        int edadSilvestre = 3;
        float kilosQueComeSilvestre = 0.5F;
        String maullidoSilvestre = "Miau!";

        System.out.println(nombreSilvestre + " tiene " + edadSilvestre + " años.");
        System.out.println(nombreSilvestre + " come " + kilosQueComeSilvestre + " kilos y hace " + maullidoSilvestre);

        System.out.println("----------------");

        //Manuelita
        String nombreManuelita = "Manuelita";
        int edadManuelita = 12;
        float kilosQueComeManuelita = 0.3F;
        String dondeVive = "Pehuajo";

        System.out.println(nombreManuelita + " tiene " + edadManuelita + " años.");
        System.out.println(nombreManuelita + " come " + kilosQueComeManuelita + " kilos y vive en " + dondeVive + ".");

        System.out.println("----------------");
        
        //Gardel
        String nombreGardel = "Gardel";
        int edadGardel = 1;
        float kilosQueComeGardel = 0.35F;
        String onomatopeya = "pio pio";

        System.out.println(nombreGardel + " tiene " + edadGardel + " años.");
        System.out.println(nombreGardel + " come " + kilosQueComeGardel + " kilos y la onomayopeya de su canto es " + onomatopeya + ".");
    }
}
