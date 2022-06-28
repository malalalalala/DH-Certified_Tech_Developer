package com.monterrosa.tp2;

import com.monterrosa.tp2.dao.impl.DomicilioDaoH2;
import com.monterrosa.tp2.dao.impl.OdontologoDaoH2;
import com.monterrosa.tp2.dao.impl.PacienteDaoH2;
import com.monterrosa.tp2.dao.impl.TurnoRepository;
import com.monterrosa.tp2.model.Domicilio;
import com.monterrosa.tp2.model.Odontologo;
import com.monterrosa.tp2.model.Paciente;
import com.monterrosa.tp2.model.Turno;
import com.monterrosa.tp2.service.DomicilioService;
import com.monterrosa.tp2.service.OdontologoService;
import com.monterrosa.tp2.service.PacienteService;
import com.monterrosa.tp2.service.TurnoService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class TurnoServiceTest {
    private static final TurnoService service = new TurnoService(new TurnoRepository());
    private static final PacienteService pacienteService = new PacienteService(new PacienteDaoH2());
    private static final OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());

    @Test
    public void agregarYBuscarTurnoTest(){
        Domicilio domicilio = new Domicilio("Av Avellaneda", "333", "CABA", "Buenos Aires");
        Paciente paciente = pacienteService.guardar(new Paciente("Micaela", "Perez", "99999999", new Date(), domicilio));
        Odontologo odontologo = odontologoService.guardar(new Odontologo("abc", "felipe", "monterrosa"));
        Turno turno = service.guardar(new Turno(pacienteService.buscar(paciente.getId()), odontologoService.buscar(odontologo.getId()) , new Date()));
        Turno turnoGuardado = service.buscar(turno.getId());
        System.out.println(turnoGuardado);
        Assert.assertNotNull(pacienteService.buscar(turnoGuardado.getId()));
    }


    @Test
    public void eliminarTurnoTest() {
        service.eliminar(99);
        Assert.assertNull(pacienteService.buscar(99));
    }

    @Test
    public void traerTodos() {
        agregarYBuscarTurnoTest();
        List<Turno> turnos = service.buscarTodos();
        System.out.println(turnos);
        Assert.assertFalse(turnos.isEmpty());
    }
}
