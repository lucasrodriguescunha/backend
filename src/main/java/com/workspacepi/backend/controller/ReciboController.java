package com.workspacepi.backend.controller;


import com.workspacepi.backend.recibo.Recibo;
import com.workspacepi.backend.recibo.ReciboRepository;
import com.workspacepi.backend.recibo.ReciboRequestDTO;
import com.workspacepi.backend.recibo.ReciboResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("recibo")
public class ReciboController {

    @Autowired
    private ReciboRepository reciboRepository;

    @PostMapping
    public void saveRecibo(@RequestBody ReciboRequestDTO data) {

    }

    @GetMapping
    public List<ReciboResponseDTO> getAll() {

        List<ReciboResponseDTO> reciboList = reciboRepository.findAll().stream().map(ReciboResponseDTO::new).toList();
        return reciboList;
    }
}
