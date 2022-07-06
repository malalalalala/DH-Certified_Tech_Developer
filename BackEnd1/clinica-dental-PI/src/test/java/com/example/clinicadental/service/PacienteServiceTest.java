package com.example.clinicadental.service;


import com.example.clinicadental.exceptions.ResourceNotFoundException;
import com.example.clinicadental.exceptions.SQLIntegrityViolationException;
import com.example.clinicadental.model.Odontologo;
import com.example.clinicadental.model.Domicilio;
import com.example.clinicadental.model.Paciente;
import com.example.clinicadental.service.DomicilioService;
import com.example.clinicadental.service.PacienteService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
public class PacienteServiceTest {
    @Autowired
    private PacienteService pacienteService;
    @Autowired
    private DomicilioService domicilioService;


    @Test
    public void agregarPaciente() throws ResourceNotFoundException {

        System.out.println("==============================");
        System.out.println("TEST AGREGAR PACIENTE");
        System.out.println("==============================");


        Domicilio domicilio = new Domicilio("Calle", "123", "Temperley", "Buenos Aires");
        Paciente paciente1 = pacienteService.guardar(new Paciente("Tomas", "Pereyra", "12345678", new Date(), domicilio));
        Domicilio domicilio2 = new Domicilio("Avenida", "123", "SiempreViva", "Bogotá");
        Paciente paciente2 = pacienteService.guardar(new Paciente("Pepito", "Perez", "45875", new Date(), domicilio2));
        Domicilio domicilio3 = new Domicilio("Carerra", "632", "Wallaby", "Sidney");
        Paciente paciente3 = pacienteService.guardar(new Paciente("Hakuna", "Matata", "4568841", new Date(), domicilio3));

        System.out.println("todos los pacientes "+pacienteService.buscarTodos());


        Assert.assertNotNull(pacienteService.buscar(paciente2.getId()));

    }


    @Test
    public void eliminarPacienteTest() throws ResourceNotFoundException, SQLIntegrityViolationException {

        System.out.println("==============================");
        System.out.println("TEST ELIMINAR PACIENTE");
        System.out.println("==============================");

        Domicilio domicilio4 = new Domicilio("Carerra", "63452", "Casa", "Roja");
        Paciente paciente4 = pacienteService.guardar(new Paciente("Walter", "White", "4568841", new Date(), domicilio4));
        pacienteService.eliminar(paciente4.getId());
        Assert.assertTrue(pacienteService.buscar(paciente4.getId()) == null);

    }

    @Test
    public void traerTodos() {

        System.out.println("==============================");
        System.out.println("TEST LISTAR PACIENTES");
        System.out.println("==============================");

        List<Paciente> pacientes = pacienteService.buscarTodos();
        Assert.assertTrue(!pacientes.isEmpty());
        Assert.assertTrue(pacientes.size() > 0);
        System.out.println(pacientes);
    }

    @Test
    public void actualizarPaciente() throws ResourceNotFoundException {

        System.out.println("==============================");
        System.out.println("TEST ACTUALIZAR PACIENTE");
        System.out.println("==============================");


        Paciente pacienteX=new Paciente("Fulanito","DeTal","1234",new Date(),new Domicilio("Calle", "345", "Calasanz", "medellín"));
        Paciente pacienteAActualizar = pacienteService.guardar(pacienteX);
        Paciente pacienteNuevaInfo=new Paciente(pacienteAActualizar.getId(),"Sultanito","Pepito","1234",new Date(),new Domicilio("Calle", "345", "Calasanz", "medellín"));

     Paciente pacienteActualizado=pacienteService.actualizar(pacienteNuevaInfo);
       assertEquals(pacienteService.buscar(pacienteAActualizar.getId()).getNombre(),"Sultanito");


        System.out.println(pacienteAActualizar.getId());

    }


}
