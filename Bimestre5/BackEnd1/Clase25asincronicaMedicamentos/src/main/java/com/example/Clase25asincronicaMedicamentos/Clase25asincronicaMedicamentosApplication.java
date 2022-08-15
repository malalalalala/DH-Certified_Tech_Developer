package com.example.Clase25asincronicaMedicamentos;

import com.example.Clase25asincronicaMedicamentos.dao.impl.MedicamentoDaoH2;
import com.example.Clase25asincronicaMedicamentos.model.Medicamento;
import com.example.Clase25asincronicaMedicamentos.service.MedicamentoService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class Clase25asincronicaMedicamentosApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(Clase25asincronicaMedicamentosApplication.class, args);
		//Creo un objeto medicamento
//        Medicamento medicamento=new Medicamento(1,123,"paracetamol","b",1,150.00);
		Medicamento medicamento=new Medicamento(123,"paracetamol","b",1,150.00);


		//creo un servicios
		MedicamentoService medicamentoService=new MedicamentoService(new MedicamentoDaoH2());

		//Esto debería guardar la tabla en la BD
		//medicamentoService.guardar(medicamento);

		Medicamento medicamentoBuscado=medicamentoService.buscar(1);
		System.out.println(medicamentoBuscado);
	}

}
