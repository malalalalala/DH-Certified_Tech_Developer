package com.example.Clase33Asincronarelaciones.model;

//@OneToOne indica relación uno a uno con Direccion. @JoinColumn tiene dos parámetros: name, usado para definir el nombre de la columna en la tabla usuarios que mapea a la clave primaria de la tabla direcciones, y referencedColumnName, que lleva el nombre del atributo de la otra tabla que queremos relacionar.

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuarioBidireccional {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_direccion" , referencedColumnName= "id")
    private DireccionBidireccional direccionBidireccional;


    public UsuarioBidireccional() {
    }

    public UsuarioBidireccional(Long id, DireccionBidireccional direccionBidireccional) {
        this.id = id;
        this.direccionBidireccional = direccionBidireccional;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DireccionBidireccional getDireccion() {
        return direccionBidireccional;
    }

    public void setDireccion(DireccionBidireccional direccionBidireccional) {
        this.direccionBidireccional = direccionBidireccional;
    }
}