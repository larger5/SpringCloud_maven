package com.cun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.cun.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>,JpaSpecificationExecutor<Student>{

}
