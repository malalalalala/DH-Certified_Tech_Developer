package c7;

public class MainChofer {
    public static void main(String[] args) {
        Chofer chofer;
        Carro carro1=new Carro("abc","tesla","el mejor");
        //cuando se crea el chofer se crea el auto que se le debe asignar a él
        chofer=new Chofer("Laura","Ramos", new Carro("abc","tesla","el mejor"));
        System.out.println("la patente del auto asignado a " +chofer.getNombre() +" es "+ chofer.verPatente());

        Chofer chofer1=new Chofer("Vicky","Agudelo",carro1);
        System.out.println("la patente del auto asignado a " +chofer1.getNombre() +" es "+ chofer1.verPatente());
        //cuando utilizo clases asociadas donde algún atributo es un objeto es importante que ese objeto esté instanciado
    }
}
