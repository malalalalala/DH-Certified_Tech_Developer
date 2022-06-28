package com.example.Clase33AsinLlavesCompuestasApp.model;


import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

//esta clase define nuestra clave dentro de la tabla persona
public class PersonaKey implements Serializable {

    private Integer dni;
    private Integer numTramite;

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Integer getNumTramite() {
        return numTramite;
    }

    public void setNumTramite(Integer numTramite) {
        this.numTramite = numTramite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaKey that = (PersonaKey) o;
        return Objects.equals(dni, that.dni) && Objects.equals(numTramite, that.numTramite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, numTramite);
    }
}
