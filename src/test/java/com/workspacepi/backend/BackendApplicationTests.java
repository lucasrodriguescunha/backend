// Define o pacote em que a classe está localizada.
// Neste caso, a classe está no pacote "com.workspacepi.backend".
package com.workspacepi.backend;

// Importa a anotação necessária para criar um teste de integração com o Spring Boot.
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Anotação que indica que esta classe é uma classe de teste do Spring Boot.
// O contexto do Spring Boot será carregado ao executar os testes nesta classe.
@SpringBootTest
class BackendApplicationTests {

    // Método de teste que verifica se o contexto do Spring Boot é carregado corretamente.
    // Não contém nenhuma lógica específica, apenas confirma que o contexto pode ser inicializado.
    @Test
    void contextLoads() {
    }

}
