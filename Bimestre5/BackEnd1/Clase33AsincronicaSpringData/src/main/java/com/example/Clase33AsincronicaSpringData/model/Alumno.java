package com.example.Clase33AsincronicaSpringData.model;

import javax.persistence.*;

@Entity
@Table
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


}
