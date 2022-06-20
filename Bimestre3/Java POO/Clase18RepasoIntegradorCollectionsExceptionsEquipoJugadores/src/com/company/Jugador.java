package com.company;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
    private String posicion;
    private String apellido;
    private String numeroCamiseta;
    private String convocatoria;
    private List<String> convocatoriasPosibles;//para que sea escalable, debería ser swtatic pero complica las cosas

    public Jugador(String posicion, String apellido, String numeroCamiseta) {
        this.posicion = posicion;
        this.apellido = apellido;
        this.numeroCamiseta = numeroCamiseta;
        setConvocatoriasPosibles();
    }
//solo yo puedo definir las convocatorias posibles
    private void setConvocatoriasPosibles() {
        this.convocatoriasPosibles = new ArrayList<>();
        this.convocatoriasPosibles.add("titular");
        this.convocatoriasPosibles.add("suplente");
        this.convocatoriasPosibles.add("reserva");
    }
    //los setters que son públicos se deben validar para no aceptar cualquier dato...se usan excepciones

    public void setConvocatoria(String convocatoria) throws ConvocatoriaInvalidaError {
        if (this.convocatoriasPosibles.contains(convocatoria)) {
            this.convocatoria = convocatoria;
        } else {
            throw new ConvocatoriaInvalidaError("La convocatoria es inválida.");
        }
    }
}
