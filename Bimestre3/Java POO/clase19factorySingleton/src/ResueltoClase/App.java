package ResueltoClase;

public class App {
    public static void main(String[] args) {
        Empresa empresa=new Empresa("Laura's software development");
        try {
            empresa.agregarEmpleados("Laura","Ramos",123,"EMP-INT");
            empresa.agregarEmpleados("Laura","Ramos",123,"EMP-EXT");
           empresa.agregarEmpleados("Laura","Ramos",123,"EMP");
               System.out.println(empresa.calcularSueldos(30));
        }catch (CodigoEmpleadoException exception){
            System.out.println(exception.getMessage());
        }catch (Exception exception){
            System.out.println("something went wrong");
        }

    }
}
