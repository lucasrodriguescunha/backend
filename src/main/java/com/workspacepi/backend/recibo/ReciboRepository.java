package com.workspacepi.backend.recibo;

import org.springframework.data.jpa.repository.JpaRepository;

// Interface que atua como repositório para a entidade Recibo
public interface ReciboRepository extends JpaRepository<Recibo, Long> {
    // O JpaRepository já fornece métodos básicos de CRUD (Create, Read, Update, Delete)
    // Não é necessário adicionar código adicional para operações simples, como salvar, buscar, atualizar ou deletar recibos
}
