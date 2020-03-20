package com.example.week6;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week6Application {

	public static void main(String[] args) {
		SpringApplication.run(Week6Application.class, args);
	}

	@Bean
	public CommandLineRunner lineRunner(EmployeeRepository employeeRepository){
		return (args) -> {
			employeeRepository.save(new Employee("John Doe",2000.0,30,45,10, EmployeeType.COMMISSION));
			employeeRepository.save(new Employee("Barbie Girl",5000.0,40,60,20, EmployeeType.SALARIED));
			employeeRepository.save(new Employee("Hanna Montana",500.0,15,22,5, EmployeeType.HOURLY));


			System.out.println("Employee finding by name");
			System.out.println("--------------------");
			System.out.println(employeeRepository.findAllByName("John"));
			System.out.println();

			System.out.println("Employee count");
			System.out.println("--------------------");
			System.out.println(employeeRepository.count());
			System.out.println();



		};
	}

}
