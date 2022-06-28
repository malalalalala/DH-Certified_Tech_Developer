package com.example.Clase34AsincHQLSintaxis.repository;

import com.example.Clase34AsincHQLSintaxis.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    @Query("select u from Usuario u where u.userName=?1order by u.userName")
    List<Usuario> findUsuarioByName(String name);

}
