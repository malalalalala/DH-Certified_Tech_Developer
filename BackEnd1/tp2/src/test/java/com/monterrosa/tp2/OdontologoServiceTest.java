package com.monterrosa.tp2;

import com.monterrosa.tp2.dao.impl.OdontologoDaoH2;
import com.monterrosa.tp2.model.Odontologo;
import com.monterrosa.tp2.service.OdontologoService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class OdontologoServiceTest {
    private OdontologoService odontologoService = new OdontologoService(new OdontologoDaoH2());


    @Test
    public void guardarOdontologo(){
        Odontologo odontologo = new Odontologo(1,"ABC123","Andres","Monterrosa");
        odontologoService.guardar(odontologo);
        Assert.assertNotNull(odontologoService.buscar(1));
    }

    @Test
    public void buscarPorId(){
        Odontologo odontologo = odontologoService.buscar(1);
        Assert.assertNotNull(odontologo);
    }

    @Test
    public void listarTodos(){
        List<Odontologo> odontologos = odontologoService.buscarTodos();
        Assert.assertTrue(odontologos.size() >= 3);
    }

}
