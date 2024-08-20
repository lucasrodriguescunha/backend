package com.workspacepi.backend.recibo;

// Importa as classes necessárias para definir a entidade e as colunas no banco de dados
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "recibo") // Define que esta classe será mapeada para uma tabela chamada "recibo" no banco de dados
@Entity(name = "recibo") // Indica que esta classe é uma entidade JPA, ou seja, um modelo que será persistido no banco de dados
@Getter // Gera automaticamente os métodos getters para todos os campos da classe
@NoArgsConstructor // Gera um construtor sem argumentos
@AllArgsConstructor // Gera um construtor com argumentos para todos os campos
@EqualsAndHashCode(of = "id") // Gera os métodos equals() e hashCode() considerando apenas o campo "id"
public class Recibo {

    @Id // Indica que o campo "id" é a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define que o valor do "id" será gerado automaticamente pelo banco de dados usando a estratégia de identidade
    private Long id; // Campo para armazenar o identificador único do recibo

    private Date data; // Campo para armazenar a data do recibo
    private String favorecido; // Campo para armazenar o nome do favorecido (pessoa que recebe o valor)
    private Double valor; // Campo para armazenar o valor do recibo
    private String cpf; // Campo para armazenar o CPF do favorecido
    private String observacao; // Campo para armazenar observações adicionais sobre o recibo
}
