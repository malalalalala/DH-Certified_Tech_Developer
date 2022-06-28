package com.example.clinicadental.service;


import com.example.clinicadental.model.Paciente;
import com.example.clinicadental.repository.impl.OdontologoDaoH2;
import com.example.clinicadental.model.Odontologo;
import com.example.clinicadental.service.OdontologoService;
import com.example.clinicadental.service.PacienteService;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringRunner.class)
@SpringBootTest
public class OdontologoServiceTest {
    @Autowired
    private OdontologoService odontologoService;

    Odontologo odontologo1=new Odontologo(1234,"Laura","Ramos");
    Odontologo odontologo2=new Odontologo(5678,"Cielo","Agudelo");
    Odontologo odontologo3=new Odontologo(91011,"Carlos","Ramirez");


    @Test
    public void registarOdontologos(){

        //revisar si existen
        Assert.assertNotNull(odontologoService.guardar(odontologo1));
        Assert.assertNotNull(odontologoService.guardar(odontologo2));
        Assert.assertNotNull(odontologoService.guardar(odontologo3));
        System.out.println("los odontologos son" +odontologoService.buscarTodos());
    }


    @Test
    public void listarTodosLosOdontologos(){


        System.out.println("los odontologos son en lsitar" +odontologoService.buscarTodos());

        Assert.assertEquals(odontologoService.buscarTodos().size(), odontologoService.buscarTodos().size());
        List<Odontologo> odontologos = odontologoService.buscarTodos();
        Assert.assertTrue(!odontologos.isEmpty());
        Assert.assertTrue(odontologos.size() > 0);
        System.out.println(odontologos);
    }

    @Test
    public void eliminarOdontologo() {
        Odontologo odontologoEliminar=odontologoService.guardar(new Odontologo(91011,"Carlos","Ramirez"));
        odontologoService.eliminar(odontologoEliminar.getId());
        assertTrue(odontologoService.buscar(odontologoEliminar.getId()) == null);

    }

    @Test
    public void buscarOdontologo() {
        Odontologo odontologoABuscar=odontologoService.guardar(new Odontologo(123,"Corre","Forest"));
        System.out.println("odontologoABuscar" +odontologoABuscar);
        System.out.println("id" +odontologoABuscar.getId());
        assertNotNull(odontologoService.buscar(odontologoABuscar.getId()));
        assertEquals(odontologoService.buscar(odontologoABuscar.getId()).getNombre(),"Corre");
        assertEquals(odontologoService.buscar(odontologoABuscar.getId()).getApellido(),"Forest");
//

    }



    @Test
    public void actualizarOdontologo() {

        Odontologo odontologoAActualizar=new Odontologo(235,"Malala","Ramos");
        Odontologo odontologo1Actualizado=new Odontologo(odontologoAActualizar.getId(),1111,"Victoria","Agudelo");
        Odontologo odontologoActualizado=odontologoService.actualizar(odontologo1Actualizado);

        System.out.println(odontologoActualizado);
        System.out.println("id"+ odontologoActualizado.getId());
        assertEquals(odontologoService.buscar(odontologo1Actualizado.getId()).getNombre(),"Victoria");

    }

}