package com.monterrosa.tp2;

import com.monterrosa.tp2.dao.impl.DomicilioDaoH2;
import com.monterrosa.tp2.dao.impl.PacienteDaoH2;
import com.monterrosa.tp2.model.Domicilio;
import com.monterrosa.tp2.model.Paciente;
import com.monterrosa.tp2.service.DomicilioService;
import com.monterrosa.tp2.service.PacienteService;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class PacienteServiceTest {
    private static PacienteService pacienteService = new PacienteService(new PacienteDaoH2());
    private DomicilioService domicilioService = new DomicilioService(new DomicilioDaoH2());


    @BeforeClass
    public static void cargarDataSet() {
        Domicilio domicilio = new Domicilio("Av Santa fe", "444", "CABA", "Buenos Aires");
        Paciente p = pacienteService.guardar(new Paciente("Santiago", "Paz", "88888888", new Date(), domicilio));
        Domicilio domicilio1 = new Domicilio("Av Avellaneda", "333", "CABA", "Buenos Aires");
        Paciente p1 = pacienteService.guardar(new Paciente("Micaela", "Perez", "99999999", new Date(), domicilio));
    }

    @Test
    public void agregarYBuscarPacienteTest(){
        Domicilio domicilio = new Domicilio("Calle", "123", "Temperley", "Buenos Aires");
        Paciente p = pacienteService.guardar(new Paciente("Tomas", "Pereyra", "12345678", new Date(), domicilio));

        Assert.assertNotNull(pacienteService.buscar(p.getId()));
    }


    @Test
    public void eliminarPacienteTest() {
        pacienteService.eliminar(3);
        Assert.assertNull(pacienteService.buscar(3));

    }

    @Test
    public void traerTodos() {
        List<Paciente> pacientes = pacienteService.buscarTodos();
        Assert.assertFalse(pacientes.isEmpty());
        Assert.assertTrue(true);
        System.out.println(pacientes);
    }
}
