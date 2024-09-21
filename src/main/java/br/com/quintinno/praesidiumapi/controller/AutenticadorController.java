package br.com.quintinno.praesidiumapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.quintinno.praesidiumapi.service.AutenticadorService;

@RestController
@RequestMapping("/api/v1/autorizador")
public class AutenticadorController {

    @Autowired
    private AutenticadorService autorizadorService;

    @PostMapping
    public String autenticador() {
        return this.autorizadorService.token();
    }

    @GetMapping("/{identificador}")
    public UserDetails findOne(@PathVariable(name = "identificador") String identificador) {
        return this.autorizadorService.loadUserByUsername(identificador);
    }

}
