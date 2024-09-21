package br.com.quintinno.praesidiumapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.quintinno.praesidiumapi.repository.UsuarioImplementacaoRepository;

@Service
public class AutenticadorService implements UserDetailsService {

    @Autowired
    public UsuarioImplementacaoRepository usuarioImplementacaoRepository;

    public String token() {
        return "token";
    }

    @Override
    public UserDetails loadUserByUsername(String identificador) throws UsernameNotFoundException {
        return this.usuarioImplementacaoRepository.recuperarUsuario(identificador);
    }

    public String gerarJWT(Authentication authentication) {
        return null;
    }

}
