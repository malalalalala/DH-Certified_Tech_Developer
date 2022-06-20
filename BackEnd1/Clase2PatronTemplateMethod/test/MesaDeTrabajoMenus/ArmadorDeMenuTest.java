package MesaDeTrabajoMenus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArmadorDeMenuTest {
    @Test
    public void preprarMenuClasicoTest(){
        ArmadorDeMenu armador= new ArmadorMenuClasico();
        String respEsperada="Iniciando el armado del menú.\n" +
                "1-Agregar comida.\n2-Cocinar comida\n";
        MenuClasico menu= new MenuClasico(100);
        String respActual=armador.preparar(menu);
        assertEquals(respEsperada,respActual);
        assertEquals(100,armador.calcularPrecio(menu));
    }

}