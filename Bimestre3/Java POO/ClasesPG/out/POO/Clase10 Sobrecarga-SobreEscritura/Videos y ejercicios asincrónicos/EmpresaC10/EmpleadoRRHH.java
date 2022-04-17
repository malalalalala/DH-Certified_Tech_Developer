package EmpresaC10;

public class EmpleadoRRHH extends EmpleadoC10{
    private int altasLogradas;

    @Override
    public void trabajar() {
              System.out.println("Empleado de RRHH " + super.getNombre() + " trabajando");
    }

    public EmpleadoRRHH(String nombre, String apellido, String dni, int altasLogradas) {
        super(nombre, apellido, dni);
        this.altasLogradas = altasLogradas;
    }
}
