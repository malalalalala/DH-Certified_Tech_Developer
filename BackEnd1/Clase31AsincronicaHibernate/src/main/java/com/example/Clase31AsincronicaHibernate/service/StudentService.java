package com.example.Clase31AsincronicaHibernate.service;

import com.example.Clase31AsincronicaHibernate.model.Student;
import com.example.Clase31AsincronicaHibernate.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService  {
    private final IStudentRepository studentRepository;

    public StudentService(IStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    public Optional<Student> findStudentById(Long id){
        return studentRepository.findById(id);
    }

    public Student saveStudent(Student studentNew){
        if (studentNew!=null){
            return studentRepository.save(studentNew);
        }
        return new Student();
    }

    public String deleteStudent(Long id){
        if (studentRepository.findById(id).isPresent()){
            studentRepository.deleteById(id);
            return "student with id" +id+" deleted";
        }
        return "student with id" +id+" doesn´t exist";
    }

    public String updateStudent(Student StudentNew){
        return null;
    }

}

