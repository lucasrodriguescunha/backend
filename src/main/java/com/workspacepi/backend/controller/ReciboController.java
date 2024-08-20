package com.workspacepi.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workspacepi.backend.recibo.ReciboRepository;
import com.workspacepi.backend.recibo.ReciboRequestDTO;
import com.workspacepi.backend.recibo.ReciboResponseDTO;

@RestController // Esta anotação indica que a classe é um controlador REST, que lida com requisições HTTP e retorna dados diretamente no corpo da resposta (em formato JSON, por exemplo).
@RequestMapping("recibo") // Define a URL base "recibo" para os endpoints dentro deste controlador. Todas as URLs deste controlador começam com "/recibo".
public class ReciboController {

    @Autowired // Esta anotação permite que o Spring injete automaticamente a dependência do ReciboRepository na classe. Isso facilita o acesso ao banco de dados.
    private ReciboRepository reciboRepository;

    // Método para salvar um recibo
    @PostMapping // Mapeia requisições HTTP POST para este método. Quando alguém envia dados para a URL "/recibo" usando POST, este método é chamado.
    public void saveRecibo(@RequestBody ReciboRequestDTO data) {
        // O corpo da requisição é convertido para um objeto ReciboRequestDTO.
        // Este método deve salvar o recibo no banco de dados, mas ainda precisa ser implementado.
    }

    // Método para obter todos os recibos
    @GetMapping // Mapeia requisições HTTP GET para este método. Quando alguém acessa a URL "/recibo" usando GET, este método é chamado.
    public List<ReciboResponseDTO> getAll() {
        // O método chama o repositório para buscar todos os recibos no banco de dados.
        // Cada recibo é convertido para um objeto ReciboResponseDTO, que é usado para transferir dados entre o servidor e o cliente.
        List<ReciboResponseDTO> reciboList = reciboRepository.findAll() // Chama o método findAll() para buscar todos os recibos.
                .stream() // Converte a lista de recibos em um fluxo (stream) para processá-los.
                .map(ReciboResponseDTO::new) // Para cada recibo, cria um novo ReciboResponseDTO.
                .toList(); // Converte o fluxo de volta para uma lista.
        return reciboList; // Retorna a lista de recibos processada.
    }
}
