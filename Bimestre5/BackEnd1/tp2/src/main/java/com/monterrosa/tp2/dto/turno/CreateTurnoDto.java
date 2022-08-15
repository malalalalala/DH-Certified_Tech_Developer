package com.monterrosa.tp2.dto.turno;

import java.util.Date;

public class CreateTurnoDto {
    private Integer pacienteId;
    private Integer odontologoId;
    private Date fecha;

    public CreateTurnoDto(Integer id, Integer pacienteId, Integer odontologoId, Date fecha) {
        this.pacienteId = pacienteId;
        this.odontologoId = odontologoId;
        this.fecha = fecha;
    }

    public CreateTurnoDto() {
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

