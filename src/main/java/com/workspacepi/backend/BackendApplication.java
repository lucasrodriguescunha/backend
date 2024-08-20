package com.workspacepi.backend;

// Importa as classes do Spring necessárias para iniciar a aplicação
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Anotação que marca a classe como uma aplicação Spring Boot
@SpringBootApplication
public class BackendApplication {

    // Método principal que inicia a aplicação
    public static void main(String[] args) {
        // Executa a aplicação Spring Boot, passando os argumentos recebidos
        SpringApplication.run(BackendApplication.class, args);
    }

}
