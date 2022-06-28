package com.example.Clase33AsincronicaSpringData.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table
public class Escuela {
    @Id
    @SequenceGenerator(name = "escuela_sequence",sequenceName = "escuela_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "escuela_sequence")
    private Long id;
    private String nombre;
    private String direccion;

    //no va a acargar los alumnos asociados a esta escuala hasta que no los necesite
    @OneToMany(mappedBy = "escuela",fetch = FetchType.LAZY)
    private Set<Alumno> alumnos=new HashSet<>();

    public Escuela(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }


    public Escuela() {
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Set<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
}
