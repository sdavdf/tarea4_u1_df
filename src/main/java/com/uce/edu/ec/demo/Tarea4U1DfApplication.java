package com.uce.edu.ec.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tarea4U1DfApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Tarea4U1DfApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Tarea con Spring Framework");
		
	}

}
