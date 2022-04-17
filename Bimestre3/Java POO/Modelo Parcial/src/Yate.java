public class Yate extends Embarcacion implements Comparable{
    private int camarotes;

    public Yate(Capitan capitan, int anioFabricacion, double eslora, double valorBase, double valorAdicional, int camarotes) {
        super(capitan, anioFabricacion, eslora, valorBase, valorAdicional);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return camarotes;
    }

    @Override
    public int compareTo(Object o) {
      return this.camarotes-((Yate)o).getCamarotes();

    }
}
