package com.example.demo.repository;

import org.springframework.data.jpa.repository.jpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public  interface StudentRepository extends jpaRepository<StudentEntity,Integer>{

}