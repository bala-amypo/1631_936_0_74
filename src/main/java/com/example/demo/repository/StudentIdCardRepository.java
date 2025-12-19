package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.StudentIdCardEntity;
@Repository
public interface StudentIdCardRepository extends JpaRepository<StudentIdCardEntity,Long>{

}