package com.example.demo.repository;

import org.springframework.data.jpa.repository.jpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.StudentEntity;
@Repository
public  interface StudentRepository extends jpaRepository<StudentEntity,Integer>{

}