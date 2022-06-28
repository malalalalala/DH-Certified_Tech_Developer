package com.example.Clase34ALoAprendido.repository;

import com.example.Clase34ALoAprendido.model.Cursada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ICursadaRepository extends JpaRepository<Cursada,Long> {

}
