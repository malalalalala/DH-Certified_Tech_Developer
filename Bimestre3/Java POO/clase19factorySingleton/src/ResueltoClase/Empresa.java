package ResueltoClase;

import java.util.HashSet;
import java.util.Set;

public class Empresa {
    private String razonSocial;
    private Set<Empleado> empleados;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        this.empleados= new HashSet<>();
    }

    public double calcularSueldos(int dias){
        double sueldosTotales=0;
        for (Empleado empleado: empleados
             ) {
            sueldosTotales+=empleado.calcularSueldo(dias);
        }
            return sueldosTotales;
    }
    public void agregarEmpleados(String nombre, String apellido, int legajo, String codigo) throws Exception  {
//        try {
//            Empleado empleado=FactoryEmpleado.create(nombre, apellido,legajo,codigo);
//            this.empleados.add(empleado);
//        }catch (CodigoEmpleadoException exception){
//            System.out.println(exception.getMessage());
//        }

        Empleado empleado=FactoryEmpleado.create(nombre, apellido,legajo,codigo);
        this.empleados.add(empleado);

    }


}
