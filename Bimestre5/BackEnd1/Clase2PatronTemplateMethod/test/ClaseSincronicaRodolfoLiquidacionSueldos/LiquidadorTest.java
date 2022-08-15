package ClaseSincronicaRodolfoLiquidacionSueldos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiquidadorTest {
    @Test
    public void emitirReciboDigitalEmpleadoEfectivo(){
        Liquidador rrhh=new LiquidadorEffectiveEmployee();
        Employee empleado1=new Effective("Martin","Martini","001d",400,40,60);
        String respEsperada="La liquidación generada es un documento digital. Saldo a liquidar: 420.0";
        String resultado=rrhh.liquidarSueldo(empleado1);

        assertEquals(respEsperada,resultado);

    }
    @Test
    public void emitirReciboDigitalEmpleadoContratado(){
        Liquidador rrhh=new LiquidadorHiredEmployee();
        Employee empleado2=new Hired("Pompilia","Pompini","55fs",120,7);
        String respEsperada="La liquidación generada es un documento impreso. Saldo a liquidar: 840.0";
        String resultado=rrhh.liquidarSueldo(empleado2);

        assertEquals(respEsperada,resultado);

    }

    @Test
    public void liquidacionInvalida(){
        Liquidador rrhh=new LiquidadorEffectiveEmployee();
        Employee empleado2=new Hired("Pompilia","Pompini","55fs",120,7);
        String respEsperada="La liquidación no pudo ser calculada";
        String resultado=rrhh.liquidarSueldo(empleado2);

        assertEquals(respEsperada,resultado);

    }



}