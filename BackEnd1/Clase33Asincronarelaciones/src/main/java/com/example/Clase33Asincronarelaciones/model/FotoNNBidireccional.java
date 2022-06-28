package com.example.Clase33Asincronarelaciones.model;

import javax.persistence.*;
import java.util.Set;

//En este código podemos observar que Foto no tiene asociado ninguna colección de elementos del tipo Contacto, ya que la navegabilidad de la relación es de Contacto hacia Foto solamente.
@Entity

@Table(name = "fotos")
public class FotoNNBidireccional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    //En la clase Foto, agregamos mappedBy para indicar qué atributo de la clase Contacto va a mapear este atributo.
    @ManyToMany(mappedBy = "likedCourses")
    private Set<ContactoNNBidireccional> contactos;
}
