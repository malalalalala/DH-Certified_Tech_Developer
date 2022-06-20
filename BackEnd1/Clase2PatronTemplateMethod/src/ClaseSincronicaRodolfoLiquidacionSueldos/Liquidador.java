package ClaseSincronicaRodolfoLiquidacionSueldos;

public abstract class Liquidador {
    public String liquidarSueldo(Employee empleado){
        String respuesta="La liquidación no pudo ser calculada";
        double sueldo=calcularSueldo(empleado);
        if(sueldo>0){
            String recibo=emitirRecibo(empleado);
            System.out.println(depositarSueldo(empleado));
            respuesta=recibo +" Saldo a liquidar: "+sueldo;
        }
        return respuesta;
    }

    protected abstract double calcularSueldo(Employee empleado);
    protected abstract String emitirRecibo(Employee empleado);
    protected String depositarSueldo(Employee empleado){
        return "order de deposito en la cuenta" +empleado.getNumeroDeCuenta();
    };
}
