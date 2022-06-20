package ClaseSincrónicaProfeRodoComputadora;

public class Computadora {
    private int ram;
    private int disco;
    private String id;
    private static int contador;

    public Computadora(int ram, int disco) {
        this.ram = ram;
        this.disco = disco;
        id="ram"+ram+"-"+"disco"+disco;
        contador++;
        System.out.println("nueva computadora, total: "+contador );
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "ram=" + ram +
                ", disco=" + disco +
                ", id='" + id + '\'' +
                '}';
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisco() {
        return disco;
    }

    public void setDisco(int disco) {
        this.disco = disco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public static int getContador() {
        return contador;
    }
}
