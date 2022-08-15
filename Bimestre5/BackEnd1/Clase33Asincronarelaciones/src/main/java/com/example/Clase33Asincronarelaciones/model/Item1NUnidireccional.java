package com.example.Clase33Asincronarelaciones.model;

import javax.persistence.*;
//En este código podemos observar que Item no tiene asociado ningún atributo del tipo Carrito, ya que la navegabilidad de la relación es de Carrito hacia Item solamente.
@Entity
@Table(name = "items")
public class Item1NUnidireccional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

}
