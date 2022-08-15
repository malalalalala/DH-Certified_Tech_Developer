package com.example.Clase34AsincHQLSintaxis.service;

import com.example.Clase34AsincHQLSintaxis.model.Usuario;
import com.example.Clase34AsincHQLSintaxis.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<Usuario> obtenerUsuarios(){
        return (ArrayList<Usuario>) usuarioRepository.findAll();
    }

    public ArrayList<Usuario> obtenerUsuariosXNombre(String nombre){
        return (ArrayList<Usuario>) usuarioRepository.findUsuarioByName(nombre);
    }

    public Usuario guardarUsuario(Usuario nuevoUsuario){
        return usuarioRepository.save(nuevoUsuario);
    }

    @PersistenceContext
    public EntityManager entityManager;

    public ArrayList<Usuario> obtenerUsuariosXNombre2(String nombre){
        ArrayList<Usuario> users= (ArrayList<Usuario>)entityManager.createQuery("select u from Usuario u where u.userName=?1order by u.userName").setParameter(1,nombre).getResultList();
        return users;
    }

}
