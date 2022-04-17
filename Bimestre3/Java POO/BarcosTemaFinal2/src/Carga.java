 public abstract class Carga {
    private String nombre;
    private String descripcion;

     public Carga(String nombre, String descripcion) {
         this.nombre = nombre;
         this.descripcion = descripcion;
     }

     public abstract double calcularPeso();

     public String getNombre() {
         return nombre;
     }
 }
