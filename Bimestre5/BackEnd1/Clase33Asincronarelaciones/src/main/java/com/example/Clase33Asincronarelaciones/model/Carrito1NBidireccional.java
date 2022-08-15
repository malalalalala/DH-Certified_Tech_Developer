package com.example.Clase33Asincronarelaciones.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

//El atributo mappedBy lo usamos para indicar que el atributo “carrito” del lado de la clase Item es quien establece la relación y el atributo JsonIgnore lo utilizamos porque —en una relación bidireccional— si este objeto viaja en formato JSON, podría entrar en un bucle infinito.
@Entity
@Table(name = "carritos")
public class Carrito1NBidireccional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @OneToMany(mappedBy = "carrito")
    @JsonIgnore
    private Set <Item1NBidireccional> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Item1NBidireccional> getItems() {
        return items;
    }

    public void setItems(Set<Item1NBidireccional> items) {
        this.items = items;
    }
}
