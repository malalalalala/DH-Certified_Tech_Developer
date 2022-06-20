package MesaDeTrabajoMenusRodo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CocineroDeMenuTest {
    @Test
    public void prepararMenuClasicoTest(){
        CocineroDeMenu cocinero=new CocineroMenuClasico();
        String respEsperada="Iniciando el armado del menu.\n1-Preparar ingredientes\n2-Cocinar ingredientes.\nEl precio del menú es: 100.0";
        Menu menuClasico=new Menu(100);
        String respActual=cocinero.preparar(menuClasico);
        assertEquals(respEsperada,respActual);
    }
    @Test
    public void prepararMenuInfantilTest(){
        CocineroDeMenu cocinero=new CocineroMenuInfantil();
        String respEsperada="Iniciando el armado del menu.\n1-Colocar juguetes\n 2-Preparar ingredientes\n3-Cocinar ingredientes.\nEl precio del menú es: 115.0";
        Menu menuInfantil=new MenuInfantil(100,5);
        String respActual=cocinero.preparar(menuInfantil);
        assertEquals(respEsperada,respActual);
    }


}