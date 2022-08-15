package com.example.Clase31SincronicaHibernateRodo.model;

import javax.persistence.*;

//tiene que tener su tabla, tiene que ser persistida
@Entity
//le digo que esto va a ser una tabla
@Table(name="tabla_movimientos")


public class Movimiento {

    //antes del atributo debo poner la anotación  del atributo que quiero que sea la clave primaria
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column
    private String descripcion;
    @Column
    private Double monto;

    public Movimiento(Long id, String descripcion, Double monto) {
        this.id = id;
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public Movimiento(String descripcion, Double monto) {
        this.descripcion = descripcion;
        this.monto = monto;
    }

    public Movimiento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }
}
