package com.richardeveloper.principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan(value = "com.richardeveloper.entities")
@ComponentScan(value = "com.richardeveloper.configs")
@EnableJpaRepositories(value = "com.richardeveloper.repositories")
@SpringBootApplication
public class CalculadoraFinanceiraApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculadoraFinanceiraApplication.class, args);
    }

}
