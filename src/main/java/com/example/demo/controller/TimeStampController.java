package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.TimeStamp;
import com.example.demo.service.TimeStampService;
@RestController
public class TimeStampController{
    @Autowired TimeStampService ser;
    @PostMapping("/post_TS")
    public TimeStamp senddata(@RequestBody TimeStamp time){
        return ser.postData(time);
    }
}