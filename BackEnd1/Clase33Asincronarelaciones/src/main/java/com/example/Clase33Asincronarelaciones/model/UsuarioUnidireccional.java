package com.example.Clase33Asincronarelaciones.model;

//relacion uno a uno, un usuario tiene una dirección

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuarioUnidireccional {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_direccion" , referencedColumnName= "id")
    private DireccionUnidireccional direccionUnidireccional;


    public UsuarioUnidireccional() {
    }

    public UsuarioUnidireccional(Long id, DireccionUnidireccional direccionUnidireccional) {
        this.id = id;
        this.direccionUnidireccional = direccionUnidireccional;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DireccionUnidireccional getDireccion() {
        return direccionUnidireccional;
    }

    public void setDireccion(DireccionUnidireccional direccionUnidireccional) {
        this.direccionUnidireccional = direccionUnidireccional;
    }
}