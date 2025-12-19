package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ExceptionHandler;
@RestController
public class GlobalException{
    @ExceptionHandler(ValidationException.class)
    public ResponseBody<string>handleValidationException(ValidationException ex){
        return new ResponseBody<string>(ex.getMessage(),H);

    }
}