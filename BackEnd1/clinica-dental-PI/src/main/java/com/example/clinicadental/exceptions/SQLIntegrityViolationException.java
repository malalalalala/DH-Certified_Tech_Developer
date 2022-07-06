package com.example.clinicadental.exceptions;

public class SQLIntegrityViolationException extends Exception{

    public SQLIntegrityViolationException(String message) {
        super(message);
    }
}
