public class CargaSimple extends Carga{
    private double pesoCarga;
    private boolean refrigeracion;

    public CargaSimple(String nombre, String descripcion, double pesoCarga, boolean refrigeracion) {
        super(nombre, descripcion);
        this.pesoCarga = pesoCarga;
        this.refrigeracion = refrigeracion;
    }

    @Override
    public double calcularPeso() {
         if(refrigeracion){
//             return this.pesoCarga*1.1;
             return this.pesoCarga+(this.pesoCarga*0.10);
         }
         return this.pesoCarga;
    }

    @Override
    public String toString() {
        return "nombre: " + super.getNombre() + "peso: $" +this.calcularPeso();
    }


}
