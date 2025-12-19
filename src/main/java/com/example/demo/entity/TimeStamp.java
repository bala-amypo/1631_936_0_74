package com.example.demo.entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
    
public class TimeStamp{
    @Id
    
    private Long id;
    private String name;
    private String email;
    private  LocalDateTime createdAt;
    private  LocalDateTime updatedAt;
}