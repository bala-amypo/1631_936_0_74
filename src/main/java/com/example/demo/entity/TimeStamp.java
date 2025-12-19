package com.example.demo.entity;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.Entity;
import java.time.LocalDateTime;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrePersist;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
    
public class TimeStamp{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private  LocalDateTime createdAt;
    private  LocalDateTime updatedAt;
    @PrePersist
    public void Oncreate(){
        LocalDateTime now=LocalDateTime().now();
        this.createdAt=now;
        this.updatedAt=now;
        
    }


}