package br.com.quintinno.praesidiumapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.quintinno.praesidiumapi.repository.UsuarioImplementacaoRepository;

import java.time.Instant;
import java.util.stream.Collectors;

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

    public String gerarTOKENJWT(Authentication authentication) {

        Instant instant = Instant.now();
        Long prazoExpiracao = 36000L;

        String escopo = authentication.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.joining(" "));

        return null;
    }

}
