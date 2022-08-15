package ClaseSincrónicaRodoCentroVacunación;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class VacunatorioTest {
    @Test
    public void vacunarPacienteOK(){
        Paciente paciente =new Paciente("Laura","Ramos","df554", LocalDate.of(2022,5,15),"Sinovac");
        Vacunatorio vacunatorio=new VacunatorioProxy();
        String respuestaEsperada="Se ha registrado el DNI df554 como persona vacunada con Sinovac";
        String respuestaActual=vacunatorio.vacunar(paciente);

        assertEquals(respuestaEsperada,respuestaActual);

    }
    @Test
    public void noSePuedeVacunar(){
        Paciente paciente =new Paciente("Laura","Ramos","df554", LocalDate.of(2022,5,22),"Sinovac");
        Vacunatorio vacunatorio=new VacunatorioProxy();
        String respuestaEsperada="vuelva cuando sea su turno :D";
        String respuestaActual=vacunatorio.vacunar(paciente);

        assertEquals(respuestaEsperada,respuestaActual);

    }

}