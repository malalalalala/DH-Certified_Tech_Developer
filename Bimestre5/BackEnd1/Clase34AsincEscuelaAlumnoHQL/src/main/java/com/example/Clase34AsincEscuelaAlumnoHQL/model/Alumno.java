package com.example.Clase34AsincEscuelaAlumnoHQL.model;

import javax.persistence.*;

@Entity
@Table (name="alumnos")
public class Alumno {
    @Id
    @SequenceGenerator(name = "alumno_sequence",sequenceName = "alumno_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "alumno_sequence")
    private Long id;
    private String nombre;
    private int edad;

    @ManyToOne(fetch = FetchType.LAZY,cascade =CascadeType.ALL )
    @JoinColumn(name="escuela_id")
    private Escuela escuela;

    public Alumno() {
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }
}
