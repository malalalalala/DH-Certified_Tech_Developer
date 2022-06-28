package com.example.Clase33Asincronarelaciones.model;

import javax.persistence.*;

//Como la relación es unidireccional, no colocamos ningún atributo del tipo Usuario en la clase Direccion.
@Entity
@Table(name = "direcciones")
public class DireccionUnidireccional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public DireccionUnidireccional() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
