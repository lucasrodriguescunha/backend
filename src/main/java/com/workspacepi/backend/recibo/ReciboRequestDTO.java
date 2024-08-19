package com.workspacepi.backend.recibo;

import javax.xml.crypto.Data;
import java.util.Date;

public record ReciboRequestDTO(Date date, String favorecido, Double valor, String cpf, String observacao) {

}
