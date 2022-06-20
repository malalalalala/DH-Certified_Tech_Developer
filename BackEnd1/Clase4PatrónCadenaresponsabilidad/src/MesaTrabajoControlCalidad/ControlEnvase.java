package MesaTrabajoControlCalidad;

public class ControlEnvase extends AnalistaDeCalidad {

    @Override
    public void verificarCalidad(Articulo articulo) {
        System.out.println("pasando por control de envase");
        if (articulo.getEnvasado().equals("sano") || articulo.getEnvasado().equals("casi sano")  ) {
            System.out.println("El control envasado fue exitoso");
        } else {
            System.out.println("No se pudo realizar la solicitud de control. Fallo control envase");
        }
    }
}
