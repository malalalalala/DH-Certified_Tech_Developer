package com.example.Clase31AsincronicaHibernate.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@ToString
@Getter
@Setter
@Entity
public class Student {

    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Id
    private Long id;
    private String dni;
    private String name;
    private String lastName;

//    public Student(Long id, String dni, String name, String lastName) {
//        this.id = id;
//        this.dni = dni;
//        this.name = name;
//        this.lastName = lastName;
//    }

    public Student() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}