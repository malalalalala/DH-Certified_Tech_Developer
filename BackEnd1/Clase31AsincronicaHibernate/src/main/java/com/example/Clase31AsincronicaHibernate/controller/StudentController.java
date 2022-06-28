package com.example.Clase31AsincronicaHibernate.controller;


import com.example.Clase31AsincronicaHibernate.model.Student;
import com.example.Clase31AsincronicaHibernate.service.StudentService;
;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    private final  StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @RequestMapping(value="/students",method = RequestMethod.GET,produces = "application/json")
    public List<Student> getStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping(value = "/students/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id){
        return studentService.findStudentById(id);
    }

    @PostMapping(value = "/student/add")
    public Student addStudent(Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping(value = "/student/delete/{id}")
    public String deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }

    @PutMapping(value = "/student/update")
    public String updateStudent(Student studentNew){
        return studentService.updateStudent(studentNew);
    }




}
