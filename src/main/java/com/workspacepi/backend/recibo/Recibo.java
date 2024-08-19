package com.workspacepi.backend.recibo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name  = "recibo")
@Entity(name  = "recibo")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Recibo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // Definição da chave primária com os metodos presentes
    private Long id;
    private Date data;
    private String favorecido;
    private Double valor;
    private String cpf;
    private String observacao;
}
