package com.workspacepi.backend.recibo;

// Importa a classe Date para trabalhar com datas
import java.util.Date;

// Define um registro (record) chamado ReciboRequestDTO com os campos especificados
public record ReciboRequestDTO(
        Date date,
        String favorecido,
        Double valor,
        String cpf,
        String observacao) {
    // O record automaticamente cria construtor, getters, equals, hashCode e toString

}
