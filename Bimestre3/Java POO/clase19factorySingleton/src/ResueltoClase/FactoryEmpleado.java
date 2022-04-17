package ResueltoClase;

public class FactoryEmpleado {
    public static Empleado create(String nombre, String apellido, int legajo, String codigo) throws CodigoEmpleadoException {
        return switch (codigo){
            case "EMP-INT"-> new EnRelacionDeDependencia(nombre,apellido,legajo);
            case "EMP-EXT"->new Contratado(nombre,apellido,legajo);
            default-> throw new CodigoEmpleadoException("código inválido");
        };
    }
}
