package com.monterrosa.tp2.dto.turno;

import java.util.Date;

public class UpdateTurnoDto {
    private Integer id;
    private Integer pacienteId;
    private Integer odontologoId;
    private Date fecha;

    public UpdateTurnoDto(Integer id, Integer pacienteId, Integer odontologoId, Date fecha) {
        this.id = id;
        this.pacienteId = pacienteId;
        this.odontologoId = odontologoId;
        this.fecha = fecha;
    }

    public UpdateTurnoDto() {
    }

    public Integer getId() {
        return id;
    }

    public Integer getPacienteId() {
        return pacienteId;
    }

    public Integer getOdontologoId() {
        return odontologoId;
    }

    public Date getFecha() {
        return fecha;
    }
}

