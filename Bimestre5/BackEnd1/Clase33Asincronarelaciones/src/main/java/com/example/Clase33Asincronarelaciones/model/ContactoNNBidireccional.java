package com.example.Clase33Asincronarelaciones.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity

@Table(name = "contactos")
public class ContactoNNBidireccional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    //@ManyToMany indica relación muchos a muchos con la clase Foto.
//
    @ManyToMany
    //@JoinTable: Lo usamos para utilizar la tabla que asocia a las dos tablas de la base de datos. Con el atributo name definimos el nombre de esta tabla.
//
    @JoinTable(
            name = "likes",
            //        joinColumns: Lo usamos para definir la columna en la tabla asociativa que apunta al id de la clase propietaria.
//
            joinColumns = @JoinColumn(name = "id_contacto"),
            //        inverseJoinColumns: Definimos la columna en la tabla externa que apunta al id de la tabla inversa de la asociación.
            inverseJoinColumns = @JoinColumn(name = "id_foto")
    )
//    JsonIgnore lo utilizamos porque —en una relación bidireccional— si este objeto viaja en formato JSON, podría entrar en un bucle infinito.
    @JsonIgnore
    private Set<FotoNNUnidireccional> likedFotos;
}
