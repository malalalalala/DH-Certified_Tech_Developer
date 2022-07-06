package com.example.clinicadental.service;

import com.example.clinicadental.exceptions.BadRequestException;
import com.example.clinicadental.exceptions.ResourceNotFoundException;
import com.example.clinicadental.model.Domicilio;
import com.example.clinicadental.model.Odontologo;
import com.example.clinicadental.model.Paciente;
import com.example.clinicadental.model.Turno;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
class TurnoServiceTest {

    @Autowired
    TurnoService turnoService;
    @Autowired
    OdontologoService odontologoService;
    @Autowired
    PacienteService pacienteService;


    @Test
    public void agregarYBuscarTurnosTest() throws BadRequestException, ResourceNotFoundException {
        System.out.println("==============================");
        System.out.println("TEST AGREGAR Y BUSCAR TURNOS");
        System.out.println("==============================");
        Domicilio domicilio = new Domicilio("Calle", "123", "Temperley", "Buenos Aires");
        Paciente paciente1 = pacienteService.guardar(new Paciente("Tomas", "Pereyra", "12345678", new Date(), domicilio));
        Odontologo odontologo1=odontologoService.guardar(new Odontologo(1234,"Laura","Ramos"));



       Turno turno = turnoService.guardar(new Turno(paciente1,odontologo1,new Date()));

      assertNotNull(turnoService.buscar(turno.getId()));

    }
    @Test
    public void eliminarTurno() throws ResourceNotFoundException, BadRequestException, SQLException {

        Domicilio domicilio = new Domicilio("Calle", "123", "Temperley", "Buenos Aires");
        Paciente paciente = pacienteService.guardar(new Paciente("Tomas", "Pereyra", "12345678", new Date(), domicilio));
        Odontologo odontologo = odontologoService.guardar(new Odontologo(2536, "Martin", "Rodriguez"));
        Turno turno = turnoService.guardar(new Turno(paciente,odontologo,new Date()));
        System.out.println("turno" + turno);

        turnoService.eliminar(turno.getId());
        assertTrue(turnoService.buscar(turno.getId()) == null);

    }

    @Test
    public void buscarTurnos() throws BadRequestException, ResourceNotFoundException {
        System.out.println("==============================");
        System.out.println("TEST BUSCAR TODOS LOS TURNOS");
        System.out.println("==============================");

        Domicilio domicilio = new Domicilio("Calle", "123", "Temperley", "Buenos Aires");
        Paciente paciente = pacienteService.guardar(new Paciente("Tomas", "Pereyra", "12345678", new Date(), domicilio));
        Odontologo odontologo = odontologoService.guardar(new Odontologo(1235, "Martin", "Rodriguez"));
        Turno turno = turnoService.guardar(new Turno(paciente,odontologo,new Date()));

        Domicilio domicilio2 = new Domicilio("Calle", "123", "Temperley", "Buenos Aires");
        Paciente paciente2 = pacienteService.guardar(new Paciente("Tomas", "Pereyra", "12345678", new Date(), domicilio2));
        Odontologo odontologo2 = odontologoService.guardar(new Odontologo(235986, "Martin", "Rodriguez"));
        Turno turno2 = turnoService.guardar(new Turno(paciente2,odontologo2,new Date()));

        List<Turno> turnos = turnoService.buscarTodos();
        Assert.assertTrue(!turnos.isEmpty());
        Assert.assertTrue(turnos.size() > 0);
        System.out.println(turnos);

    }

    @Test
    void actualizar() {
    }
}