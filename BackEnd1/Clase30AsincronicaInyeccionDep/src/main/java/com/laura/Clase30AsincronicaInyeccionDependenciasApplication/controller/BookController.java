package com.laura.Clase30AsincronicaInyeccionDependenciasApplication.controller;

import com.laura.Clase30AsincronicaInyeccionDependenciasApplication.model.Book;
import com.laura.Clase30AsincronicaInyeccionDependenciasApplication.repository.impl.BookRepository;
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
