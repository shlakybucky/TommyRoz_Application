package com.example.tommy_roz.exceptions.handler;

import com.example.tommy_roz.exceptions.NotFoundException;
import liquibase.exception.DatabaseException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DataBaseExceptionHandler{

    @ExceptionHandler(DatabaseException.class)
    public ResponseEntity<String> handleDatabaseError(DatabaseException db_ex){
        return new ResponseEntity<>(db_ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<String> handleUserNotFound(NotFoundException user_not_found_ex){
        return new ResponseEntity<String>(user_not_found_ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
