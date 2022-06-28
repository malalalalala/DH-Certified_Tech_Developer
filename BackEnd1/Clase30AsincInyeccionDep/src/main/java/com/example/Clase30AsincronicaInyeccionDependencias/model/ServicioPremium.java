package com.example.Clase30AsincronicaInyeccionDependencias.model;

public class ServicioPremium {

    //Genero dependencia entre Servicio Habitacion, ServicioClasico y ServicioPremium
    ServicioClasico servicioClasico;
    ServicioPremium servicioPremium;

    //inyecto dependencia mediante consructor

    public ServicioPremium(ServicioClasico servicioClasico, ServicioPremium servicioPremium) {
        this.servicioClasico = servicioClasico;
        this.servicioPremium = servicioPremium;
    }
}
//en un proyecto sin springBoot