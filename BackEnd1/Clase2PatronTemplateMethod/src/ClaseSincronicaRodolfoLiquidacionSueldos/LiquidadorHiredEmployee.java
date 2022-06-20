package ClaseSincronicaRodolfoLiquidacionSueldos;

public class LiquidadorHiredEmployee extends Liquidador{
    @Override
    protected double calcularSueldo(Employee empleado) {
        double mensajeDeRespuesta=0;
        if(empleado instanceof Hired){
            Hired empl=(Hired) empleado;//casteo para poder usar los métodos de employee, si le doy empleado. me va a pedir que castee
            double sueldoFinal=empl.getCantidadHoras()*empl.getValorHora();
            mensajeDeRespuesta=sueldoFinal;
        }
        return mensajeDeRespuesta;
    }

    @Override
    protected String emitirRecibo(Employee empleado) {
        return "La liquidación generada es un documento impreso.";
    }
}
