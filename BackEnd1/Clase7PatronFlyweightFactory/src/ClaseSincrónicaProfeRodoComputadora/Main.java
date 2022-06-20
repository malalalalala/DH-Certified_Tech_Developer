package ClaseSincrónicaProfeRodoComputadora;

public class Main {
    public static void main(String[] args) {
        ComputadoraFactory fabrica=new ComputadoraFactory();
        //tres computadoras
        Computadora windows1=fabrica.getComputadora(2,128);
        Computadora mac1=fabrica.getComputadora(16,500);
        Computadora windows2=fabrica.getComputadora(2,128);

        //mostramos la info de cada una invocando a su toString

        System.out.println(windows1);
        System.out.println(mac1);
        System.out.println(windows2);


        //creamos 100 computadoras

        for (int i=1;i<=100;i++){
            fabrica.getComputadora(16,100);
        }
        //mostrar la cantidad de compus creadas realmente en memoria

        System.out.println("compus creadas reales " +Computadora.getContador());
    }
}
