package EmpresaC10;

public class EmpleadoProduccion extends EmpleadoC10{
    private String tiempoExperiencia;

    @Override
    public void trabajar() {
        System.out.println("Empleado de Marketing " + super.getNombre() + " lleva trabajando en la empresa " + tiempoExperiencia + " anios ");
    }

    public EmpleadoProduccion(String nombre, String apellido, String dni, String tiempoExperiencia) {
        super(nombre, apellido, dni);
        this.tiempoExperiencia = tiempoExperiencia;
    }
}

