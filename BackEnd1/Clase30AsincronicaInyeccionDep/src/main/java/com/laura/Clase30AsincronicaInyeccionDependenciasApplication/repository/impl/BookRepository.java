package com.laura.Clase30AsincronicaInyeccionDependenciasApplication.repository.impl;

import com.laura.Clase30AsincronicaInyeccionDependenciasApplication.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {
    public List<Book> traerTodos(){

        List<Book> listaBooks=new ArrayList<>();
        listaBooks.add(new Book(1L,"harrypotter","Rowland"));
        listaBooks.add(new Book(2L,"CACACA","SDFD"));

        return listaBooks;
    }
}
