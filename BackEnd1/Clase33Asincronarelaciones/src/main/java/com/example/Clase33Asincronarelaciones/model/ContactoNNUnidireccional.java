package com.example.Clase33Asincronarelaciones.model;

import javax.persistence.*;
import java.util.Set;

@Entity

@Table(name = "contactos")
public class ContactoNNUnidireccional {

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
            private Set<FotoNNUnidireccional> likedFotos;
}
