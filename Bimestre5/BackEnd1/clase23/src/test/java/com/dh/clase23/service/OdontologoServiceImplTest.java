package com.dh.clase23.service;

import com.dh.clase23.repository.H2Aux;
import com.dh.clase23.repository.OdontologoDAOH2;
import com.dh.clase23.dominio.Odontologo;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class OdontologoServiceImplTest {
    @Autowired
    IOdontologoService odontologoService;

    @BeforeAll
    public static void prepararBD(){
        try{
            H2Aux.getConnectionWithScript();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    @Order(1)
    public void agregarOdontologoTest(){
        Odontologo odontologoDePrueba= new Odontologo("Dientes","Pedro",841);
        odontologoService.guardarOdontologo(odontologoDePrueba);
        Odontologo odontologoDePruebaRecuperado=odontologoService.buscarXId(2);
        assertNotNull(odontologoDePruebaRecuperado);
    }
    @Test
    @Order(2)
    public void buscarXIdTest(){
        int idBuscado=1;
        Odontologo odontologoDePruebaBuscado=odontologoService.buscarXId(idBuscado);
        assertNotNull(odontologoDePruebaBuscado);
    }
    @Test
    @Order(3)
    public void listarOdontologosTest(){
        List<Odontologo> listaDePrueba=odontologoService.listarOdontologos();
        assertTrue(listaDePrueba.size()>0);
    }
    @Test
    @Order(4)
    public void actualizarOdontologoTest(){
        Odontologo odontologoConNuevosDatos=new Odontologo(2,"Tornero","Pedro",841);
        odontologoService.actualizarOdontologo(odontologoConNuevosDatos);
        Odontologo odontologoRecuperado=odontologoService.buscarXId(2);
        assertEquals("Tornero",odontologoRecuperado.getApellido());
    }
    @Test
    @Order(5)
    public void eliminarOdontologoTest(){
        int idParaBorrar=2;
        odontologoService.eliminarOdontologo(idParaBorrar);
        Odontologo odontologoRecuperado=odontologoService.buscarXId(2);
        assertNull(odontologoRecuperado);
    }

}