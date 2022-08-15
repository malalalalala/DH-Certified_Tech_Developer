package ClaseSincronicaRodolfoLiquidacionSueldos;

public class LiquidadorEffectiveEmployee extends Liquidador{
    @Override
    protected double calcularSueldo(Employee empleado) {
        double mensajeDeRespuesta=0;
        if(empleado instanceof Effective){
            Effective empl=(Effective) empleado;//casteo para poder usar los métodos de employee, si le doy empleado. me va a pedir que castee
            double sueldoFinal=empl.getSueldoBase()+empl.getPremios()-empl.getDescuentos();
            mensajeDeRespuesta=sueldoFinal;
        }
        return mensajeDeRespuesta;
    }

    @Override
    protected String emitirRecibo(Employee empleado) {
        return "La liquidación generada es un documento digital.";
    }
}
