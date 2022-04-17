package poo.varela;

public class Test {

    public static void main(String[] args) throws Exception {
        Empresa empresa = new Empresa("TecnoPOO");
        Servicio ventaAire = FabricaDeServicios.obtenerInstancia().crearOfertaAcademica("simple");
        Servicio colocacion = FabricaDeServicios.obtenerInstancia().crearOfertaAcademica("simple");
        Servicio combo = FabricaDeServicios.obtenerInstancia().crearOfertaAcademica("combo");

        ventaAire.setNombre("Venta de aire acondicionado");
        ventaAire.setDescripcion("Venta de aire acondicionado");
        ((ServicioSimple) ventaAire).setPrecio(65000);

        colocacion.setNombre("Colocación");
        colocacion.setDescripcion("Colocación de aire acondicionado");
        ((ServicioSimple) colocacion).setPrecio(10000);

        combo.setNombre("Venta + Colocación");
        combo.setDescripcion("Venta + Colocación de aire acondicionado");
        ((Combo) combo).setDescuento(0.1);
        ((Combo) combo).agregar(ventaAire);
        ((Combo) combo).agregar(colocacion);

        empresa.agregar(ventaAire);
        empresa.agregar(colocacion);
        empresa.agregar(combo);

        empresa.mostrarServicios();

        try {
            Servicio c0mb0 = FabricaDeServicios.obtenerInstancia().crearOfertaAcademica("c0mb0");
        } catch (TipoDeServicioIncorrectoException e) {
            System.err.println(e.getMessage());
        }
    }
}
