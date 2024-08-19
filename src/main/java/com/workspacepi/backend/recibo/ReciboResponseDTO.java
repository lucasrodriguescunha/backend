package com.workspacepi.backend.recibo;

import java.util.Date;

public record ReciboResponseDTO(Long id, String favorecido, Date data, Double Valor, String cpf, String observacao) {

    public ReciboResponseDTO(Recibo recibo){
        this(recibo.getId(), recibo.getFavorecido(), recibo.getData(), recibo.getValor(), recibo.getCpf(), recibo.getObservacao());
    }



}
