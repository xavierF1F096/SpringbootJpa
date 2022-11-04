package com.example_jpa.ejercicio_jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentReposiroty extends JpaRepository<Student,Long>{
    
}
