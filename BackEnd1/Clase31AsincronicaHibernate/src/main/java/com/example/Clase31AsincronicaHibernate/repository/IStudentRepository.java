package com.example.Clase31AsincronicaHibernate.repository;

//primer argumento es la clase y el segundo el tipo de dato del id

import com.example.Clase31AsincronicaHibernate.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long> {
}
