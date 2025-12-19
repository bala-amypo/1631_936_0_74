package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
@RestController
public class GlobalException{
    @ExceptionHandler(ValidationException.class)
    public ResponseEntity<string>handleValidationException(ValidationException ex){
        return new ResponseEntity<string>(ex.getMessage(),HttpStatus.BAD_GATEWAY);

    }
}