package com.monterrosa.tp2;

import com.monterrosa.tp2.dao.impl.OdontologoDaoH2;
import com.monterrosa.tp2.dao.impl.PacienteDaoH2;
import com.monterrosa.tp2.model.Domicilio;
import com.monterrosa.tp2.model.Odontologo;
import com.monterrosa.tp2.model.Paciente;
import com.monterrosa.tp2.service.OdontologoService;
import com.monterrosa.tp2.service.PacienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Tp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp2Application.class, args);

		PacienteService pacienteService = new PacienteService(new PacienteDaoH2());

		Domicilio domicilio = new Domicilio("Av Santa fe", "444", "CABA", "Buenos Aires");
		Paciente paciente= new Paciente("Santiago", "Paz", "88888888", new Date(), domicilio);
		Paciente p = pacienteService.guardar(paciente);

		OdontologoService odontologoService= new OdontologoService(new OdontologoDaoH2());

		Odontologo odontologo1 = new Odontologo(1,"ABC123","Andres","Monterrosa");
		odontologoService.guardar(odontologo1);

		Odontologo odontologo2 = new Odontologo(2,"DEF456","Felipe","Alarcon");
		odontologoService.guardar(odontologo2);

		Odontologo odontologo3 = new Odontologo(3,"GHI789","Camilo","Jimenez");
		odontologoService.guardar(odontologo3);

		Odontologo odontologo4 = new Odontologo(4,"JKL123","Fabian","Quiroga");
		odontologoService.guardar(odontologo4);

//        Odontologo obtenerOdontologo1 = odontologoService.buscar(1);
//        Odontologo obtenerOdontologo2 = odontologoService.buscar(2);
//        Odontologo obtenerOdontologo3 = odontologoService.buscar(3);
//        Odontologo obtenerOdontologo4 = odontologoService.buscar(4);

		List<Odontologo> odontologos = odontologoService.buscarTodos();
	}

}
