package br.com.quintinno.praesidiumapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/privado")
public class PrivadoController {

    @GetMapping
    public String privado() {
        return "Dado Privado!";
    }

}
