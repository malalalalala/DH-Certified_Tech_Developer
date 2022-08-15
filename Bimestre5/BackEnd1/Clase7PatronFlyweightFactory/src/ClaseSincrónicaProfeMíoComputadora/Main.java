package ClaseSincrónicaProfeMíoComputadora;

public class Main {
    public static void main(String[] args) {
      ComputadoraFactory computadoraFactory=new ComputadoraFactory();
      computadoraFactory.crearComputadora(16,128);
      computadoraFactory.crearComputadora(16,128);
      computadoraFactory.crearComputadora(16,256);
      computadoraFactory.crearComputadora(16,128);
      computadoraFactory.crearComputadora(32,128);
    }
}
