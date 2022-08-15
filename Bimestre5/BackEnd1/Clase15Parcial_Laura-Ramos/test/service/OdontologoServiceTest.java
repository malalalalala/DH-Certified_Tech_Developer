package service;

import dao.impl.OdontologoDaoH2;
import model.Odontologo;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OdontologoServiceTest {
    OdontologoService odontologoService=new OdontologoService(new OdontologoDaoH2());

    @Test
    public void registarOdontologos(){
//        Odontologo odontologo1=new Odontologo(1234,"Laura","Ramos");
//        Odontologo odontologo2=new Odontologo(5678,"Cielo","Agudelo");
//        Odontologo odontologo3=new Odontologo(91011,"Carlos","Ramírez");
//
//
//
//        //revisar si existen
//        Assert.assertNotNull(odontologoService.registrar(odontologo1));
//        Assert.assertNotNull(odontologoService.registrar(odontologo2));
//        Assert.assertNotNull(odontologoService.registrar(odontologo3));
    }

    @Test
    public void listarTodosLosOdontologos(){


        //System.out.println("el tamaño del listado es : "+odontologoService.listarTodos().size());

        Assert.assertEquals(3, odontologoService.listarTodos().size());
    }


}