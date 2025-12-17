package com.example.demo.controller;
import org.springframework.web.blind.annotation.RequestBody;
import org.springframework.web.blind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.blind.annotation.RestController;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
@RestController
public class StudentController{
    @Autowired StudentService ser;
    @PostMapping("/post")
    public StudentEntity senddata(@RequestBody StudentEntity student){
        return ser.postData(student);
    }

}