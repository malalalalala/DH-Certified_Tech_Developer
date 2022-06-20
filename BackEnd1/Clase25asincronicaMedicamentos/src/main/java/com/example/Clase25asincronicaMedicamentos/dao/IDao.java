package com.example.Clase25asincronicaMedicamentos.dao;


import java.sql.SQLException;

public interface IDao <T> {

    public T guardar(T t);

    public T buscar(Integer id) ;




}
