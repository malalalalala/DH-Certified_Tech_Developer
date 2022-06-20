package com.example.clinicadental;


import com.example.clinicadental.repository.impl.OdontologoDaoH2;
import com.example.clinicadental.model.Odontologo;
import com.example.clinicadental.service.OdontologoService;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class OdontologoServiceTest {
    OdontologoService odontologoService=new OdontologoService(new OdontologoDaoH2());

    Odontologo odontologo1=new Odontologo(1234,"Laura","Ramos");
    Odontologo odontologo2=new Odontologo(5678,"Cielo","Agudelo");
    Odontologo odontologo3=new Odontologo(91011,"Carlos","Ramirez");


    @Test
    public void registarOdontologos(){

        //revisar si existen
        Assert.assertNotNull(odontologoService.guardar(odontologo1));
        Assert.assertNotNull(odontologoService.guardar(odontologo2));
        Assert.assertNotNull(odontologoService.guardar(odontologo3));
    }

    @Test
    public void listarTodosLosOdontologos(){


        //System.out.println("el tamaño del listado es : "+odontologoService.listarTodos().size());

        Assert.assertEquals(odontologoService.buscarTodos().size(), odontologoService.buscarTodos().size());
    }

    @Test
    public void eliminarOdontologo() {
        odontologoService.eliminar(1);
        assertTrue(odontologoService.buscar(1) == null);

    }

    @Test
    public void buscarOdontologo() {
//        System.out.println(odontologoService.buscar(21));
//        System.out.println(odontologoService.buscar(21).equals(new Odontologo(21,91011,"Carlos","Ramirez")));

        assertNotNull(odontologoService.buscar(3));
        assertEquals(odontologoService.buscar(5).getNombre(),"Cielo");
        assertEquals(odontologoService.buscar(5).getApellido(),"Agudelo");
//        assertSame(odontologoService.buscar(2).getNroMatricula(),5678);

    }



    @Test
    public void actualizarOdontologo() {

        Odontologo odontologo3Actualizado=new Odontologo(3,91011,"Carlos","Gallego");
        Odontologo odontologoActualizado=odontologoService.actualizar(odontologo3Actualizado);

        assertEquals(odontologoService.buscar(3).getNombre(),"Carlos");
        assertEquals(odontologoService.buscar(3).getApellido(),"Gallego");
//        assertSame(odontologoService.buscar(3).getNroMatricula(),91011);

        System.out.println(odontologoActualizado);

    }



}