package com.example.Ejemplo_Semana08.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoController {
    @GetMapping("/saludo")
    public String Saludo(){
        return "Hola desde PULL REQUEST";
    }
}
