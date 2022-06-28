package com.example.Clase33Asincronarelaciones.model;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item1NBidireccional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "carrito_id", nullable = false)

    private Carrito1NBidireccional carrito;

}
