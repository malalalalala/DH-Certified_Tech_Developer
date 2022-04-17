public class Simple extends Servicio{
    private double precio;
    public static final String NOMBRE_SERVICIO_DESCUENTO="Colocación";
    public static final double DESCUENTO=10.00;

    public Simple(String nombre, String descripcion, double precio) {
        super(nombre, descripcion);
        this.precio = precio;
    }


    @Override
    public double calcularPrecio() {
         if(this.getNombre().equals(NOMBRE_SERVICIO_DESCUENTO)){
            return this.precio*(1+DESCUENTO/100);
            }
         return  this.precio;
    }

    @Override
    public String toString() {
        return "Nombre " +super.getNombre() +"precio" + this.calcularPrecio();
    }
}
