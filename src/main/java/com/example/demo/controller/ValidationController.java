package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
@RestController
public class ValidationController{
    @Autowired ValidationService ser;
    @PostMapping("/post_validation")
    public ValidationEntity senddata(@Valid @RequestBody ValidationEntity valid){
        return ser.postData(valid);
    }
    @GetMapping("/get_validate/{id}")
    public ValidationEntity getidval(@PathVariable int id){
        return ser.getData(id);
    }
}
