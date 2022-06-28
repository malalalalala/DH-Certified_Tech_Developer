package com.example.Clase33Asincronarelaciones.model;

import javax.persistence.*;


@Entity
@Table(name = "direcciones")
public class DireccionBidireccional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    //El atributo mappedBy lo usamos para indicar que el atributo “direccion” del lado de la clase Usuario es quien establece la relación.
    @OneToOne(mappedBy = "direccion")
    private UsuarioBidireccional usuario;


}

