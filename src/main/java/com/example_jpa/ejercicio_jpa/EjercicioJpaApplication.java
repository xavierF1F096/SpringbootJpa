package com.example_jpa.ejercicio_jpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioJpaApplication.class, args);
	}

	CommandLineRunner commandLineRunner(StudentReposiroty studentReposiroty){
       return args ->{
		       Student maria=new Student(
				"maria",
				"morelos",
				"mariamo@gmail.com",
				21);
		  studentReposiroty.save(maria);
	   };	 
	}
   
}
