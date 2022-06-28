package com.example.Clase33Asincronarelaciones.model;

import javax.persistence.*;
import java.util.Set;
//Para realizar una relación uno a muchos unidireccional usamos la anotación @OneToMany. La anotación @JoinColumn estará ubicada del lado “one” de la relación, pero hace referencia a la tabla en la base de datos del “many” de esta. Por ejemplo, tenemos dos tablas: Carrito e Items. Cada una de estas tablas tendrá su respectiva clase en el modelo de entidades, la anotación @JoinColumn es usada en la clase Carrito referenciando a la FK (carrito_id) de la tabla Items.
@Entity
@Table(name = "carritos")
public class Carrito1NUnidireccional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "carrito_id")
    private Set <Item1NUnidireccional> items;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Item1NUnidireccional> getItems() {
        return items;
    }

    public void setItems(Set<Item1NUnidireccional> items) {
        this.items = items;
    }
}
