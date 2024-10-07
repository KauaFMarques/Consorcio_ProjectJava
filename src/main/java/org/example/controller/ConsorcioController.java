package org.example.controller;

import org.example.model.Cliente;
import org.example.service.ConsorcioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consorcio")
public class ConsorcioController {
    @Autowired
    private ConsorcioService consorcioService;

    @PostMapping
    public ResponseEntity<?> calcularConsorcio(@RequestBody Cliente cliente) {
        return ResponseEntity.ok(consorcioService.calcularConsorcio(cliente));
    }
}
