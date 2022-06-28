package com.example.Clase33Asincronarelaciones.model;

import javax.persistence.*;
//En este código podemos observar que Foto no tiene asociado ninguna colección de elementos del tipo Contacto, ya que la navegabilidad de la relación es de Contacto hacia Foto solamente.
@Entity

@Table(name = "fotos")
public class FotoNNUnidireccional {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")

    private Long id;
}
