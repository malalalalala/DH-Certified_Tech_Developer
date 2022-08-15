package MesaDeTrabajoAreaFiguras;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcularAreaTest {
    @Test
    public void probarTest(){
        CalcularArea figura1 = new CalcularArea("circulo", 5.5);
        CalcularArea figura2 = new CalcularArea("cuadrado", 4.0);
        CalcularArea figura3 = new CalcularArea("circulo", 0.0);

        assertEquals(95.0,figura1.CalcularAreaCirculo());
        assertEquals(16.0,figura2.CalcularAreaCuadrado());
        assertEquals(0.0,figura3.CalcularAreaCirculo());
        //assertEquals(100,figura1.CalcularAreaCirculo());

//        Assertions.assertEquals("el area del circulo es 95",figura1.CalcularAreaCirculo());
//        Assertions.assertEquals("el area del cuadrado es 16", figura2.CalcularAreaCuadrado());
//        Assertions.assertEquals("el valor del radio debe ser mayor a cero",figura3.CalcularAreaCirculo());
//        Assertions.assertNotEquals("el area del circulo es 100",figura1.CalcularAreaCirculo());

    }


}