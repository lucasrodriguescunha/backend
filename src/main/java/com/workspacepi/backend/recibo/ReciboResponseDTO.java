package com.workspacepi.backend.recibo;

// Importa a classe Date para trabalhar com datas
import java.util.Date;

// Define um registro (record) chamado ReciboResponseDTO com os campos especificados
public record ReciboResponseDTO(
        Long id, // Identificador único do recibo
        String favorecido, // Nome do favorecido
        Date data, // Data do recibo
        Double valor, // Valor monetário do recibo
        String cpf, // CPF do favorecido
        String observacao // Observações adicionais
        ) {

    // Construtor que cria um ReciboResponseDTO a partir de uma instância de Recibo
    public ReciboResponseDTO(Recibo recibo) {
        // Chama o construtor principal do record usando os dados da instância de Recibo fornecida
        this(
                recibo.getId(), // Obtém o ID do recibo
                recibo.getFavorecido(), // Obtém o nome do favorecido
                recibo.getData(), // Obtém a data do recibo
                recibo.getValor(), // Obtém o valor do recibo
                recibo.getCpf(), // Obtém o CPF do favorecido
                recibo.getObservacao() // Obtém as observações do recibo
        );
    }

}
