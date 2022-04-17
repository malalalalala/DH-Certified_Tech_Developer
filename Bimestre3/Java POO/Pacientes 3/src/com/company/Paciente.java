package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws DateException
    {   Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        if (fechaInternacion.before(hoy))
            this.fechaInternacion=fechaInternacion;
        else { throw new DateException("La fecha de internación no puede ser posterior a la fecha actual");}
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws DateException
    {
        if (fechaAlta.before(fechaInternacion))
            throw new DateException("La fecha de alta no puede ser anterior a la fecha de internacion"+ fechaInternacion.toString()+ fechaAlta.toString());
        else { setFechaAlta(fechaAlta);  }
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
