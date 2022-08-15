package ClaseSincrónicaProfeMíoComputadora;

public class Computadora {
    private int ram;
    private int disc;

    public Computadora(int ram, int disc) {
        this.ram = ram;
        this.disc = disc;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getDisc() {
        return disc;
    }

    public void setDisc(int disc) {
        this.disc = disc;
    }

    @Override
    public String toString() {
        return "ram" + ram+
                "disco" +disc;
    }
}
