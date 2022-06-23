package com.example.c31s.model;

import javax.persistence.*;

@Entity
@Table(name = "tabla_usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String usurio;
    private String password;

    public Usuario() {
    }

    public Usuario(Long id, String usurio, String password) {
        this.id = id;
        this.usurio = usurio;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsurio() {
        return usurio;
    }

    public void setUsurio(String usurio) {
        this.usurio = usurio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
