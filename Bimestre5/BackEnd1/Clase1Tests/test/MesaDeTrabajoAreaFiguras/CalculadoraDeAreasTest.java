package MesaDeTrabajoAreaFiguras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDeAreasTest {
    @Test
    public void areaCirculoTest(){
        CalculadoraDeAreas calculadora= new CalculadoraDeAreas();
        double radioDePrueba=0.5;
        String resultadoEsperado="El área del círculo es de 0.7853981633974483 unidades";
        String resultadoActual=calculadora.calcularAreaCirculo(radioDePrueba);

        assertEquals(resultadoEsperado,resultadoActual);
    }
    @Test
    public void areaCuadradoTest(){
        CalculadoraDeAreas calculadora= new CalculadoraDeAreas();
        double ladoDePrueba=2;
        String resultadoEsperado="El área del cuadrado es de 4 unidades";
        String resultadoActual=calculadora.calcularAreaCuadrado(ladoDePrueba);

        assertEquals(resultadoEsperado,resultadoActual);
    }

    @Test
    public void areaCuadradoTestLadoCero(){
        CalculadoraDeAreas calculadora= new CalculadoraDeAreas();
        double ladoDePrueba=0;
        String resultadoEsperado="El valor del lado debe ser mayor que cero";
        String resultadoActual=calculadora.calcularAreaCuadrado(ladoDePrueba);

        assertEquals(resultadoEsperado,resultadoActual);
    }

}