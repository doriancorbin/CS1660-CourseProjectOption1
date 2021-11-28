package com.example.springboot;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.example.springboot"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
             System.out.println("1. Apache Hadoop: 34.145.202.186");
             System.out.println("2. Apache Spark: 34.85.253.56");
             System.out.println("3. Jupyter Notebook: 34.85.245.163");
             System.out.println("4. SonarQube: 34.86.39.152");
		};
	}

}
