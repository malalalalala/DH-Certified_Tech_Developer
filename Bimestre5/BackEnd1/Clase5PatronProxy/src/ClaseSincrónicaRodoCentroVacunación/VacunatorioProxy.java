package ClaseSincrónicaRodoCentroVacunación;

import java.time.LocalDate;

public class VacunatorioProxy implements Vacunatorio{
    private VacunatorioService vacunatorioReal;
    @Override
    public String vacunar(Paciente paciente) {
        //controlar la fecha de vacunacion
        //fecha de hoy
        LocalDate hoy=LocalDate.now();
        System.out.println("Revisando si se puede vacunar");
        String mensaje="vuelva cuando sea su turno :D";
        if(hoy.isAfter(paciente.getFechaAsignada())){
            //consumir el servicio ya que pasó el filtro
            vacunatorioReal= new VacunatorioService();
            mensaje=vacunatorioReal.vacunar(paciente);
        }
        return  mensaje;
    }
}
