package com.example.Clase34ALoAprendido;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

;

@ControllerAdvice
public class GlobalExceprionHandler {

    public static final Logger logger=Logger.getLogger(GlobalExceprionHandler.class);

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> todosErrores(Exception ex, WebRequest req){

     logger.error(ex.getMessage());
     return new ResponseEntity("Error"+ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
