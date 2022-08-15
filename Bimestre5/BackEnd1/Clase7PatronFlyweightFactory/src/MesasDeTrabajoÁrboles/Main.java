package MesasDeTrabajoÁrboles;

public class Main {



    public static void main(String[] args) {
        Bosque bosque = new Bosque();
        Runtime runtime = Runtime.getRuntime();

        bosque.plantarArboles();

        System.out.println("Memoria usada: " + (runtime.totalMemory()-runtime.freeMemory()) / (1024 * 1024));
    }


}
