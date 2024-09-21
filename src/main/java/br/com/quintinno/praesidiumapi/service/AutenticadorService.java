package br.com.quintinno.praesidiumapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.quintinno.praesidiumapi.entity.UsuarioEntity;
import br.com.quintinno.praesidiumapi.repository.UsuarioImplementacaoRepository;

@Service
public class AutenticadorService {

    @Autowired
    public UsuarioImplementacaoRepository usuarioImplementacaoRepository;

    public String token() {
        return "token";
    }

    public UsuarioEntity findOne(String identificador) {
        return this.usuarioImplementacaoRepository.recuperarUsuario(identificador);
    }

}
