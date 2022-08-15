package com.example.Clase30AsincronicaInyeccionDependencias.controller;

import com.example.Clase30AsincronicaInyeccionDependencias.model.Book;
import com.example.Clase30AsincronicaInyeccionDependencias.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//normalmente se creería una instancia de BookRepository, pero con la inyección funciona diferente
public class BookController {

    //El autowired inyecta la dependencia sin la necesida dd ecrear un objeto

    //permite que un controller haga uso de los métodos sin crear instancias
    @Autowired
    BookRepository repository;

    @GetMapping("/books")
    public List<Book> traerTodos(){
        return repository.traerTodos();
    }
}
