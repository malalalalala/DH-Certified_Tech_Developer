package com.example.Clase34ALoAprendido;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase34ALoAprendido {

	public static void main(String[] args) {


		PropertyConfigurator.configure("log4j.properties");
		SpringApplication.run(Clase34ALoAprendido.class, args);

	}

}
