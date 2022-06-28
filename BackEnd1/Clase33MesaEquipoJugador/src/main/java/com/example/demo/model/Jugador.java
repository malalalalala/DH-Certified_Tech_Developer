package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "jugadores")
public class Jugador  {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String puesto;
    private int numero;

    public Jugador(Long id, String nombre, String puesto, int numero) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.numero = numero;
    }

    public Jugador() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
