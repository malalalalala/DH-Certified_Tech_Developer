import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String razonSocial;
    private List<Empleado> empleados=new ArrayList<>();

    public void incorporarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
    }

    public int obtainCantidadEnpleados(){
        return this.empleados.size();

    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
}
