 public abstract class Carga {
    private String nombre;

     public Carga(String nombre) {
         this.nombre = nombre;
     }

     public abstract double calcularPeso();

     public String getNombre() {
         return nombre;
     }
 }
