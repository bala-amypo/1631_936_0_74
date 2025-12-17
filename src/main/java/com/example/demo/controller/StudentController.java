package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.blind.annotation.RestController;
@RestController
public class StudentController{
    @Autowired StudentService ser;
    @postMapping("/post")
    public StudentEntity senddata(@RequestBody StudentEntity student){
        return ser.postData(student);
    }

}