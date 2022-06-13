package com.example.portfolio.portfoliospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class PortfolioSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioSpringbootApplication.class, args);
		System.out.println("App is Running !!!");
	}

//
//	@GetMapping("/hi")
//	public String getData(){
//		return "Holà !! Bonjur....!!";
//	}
}
