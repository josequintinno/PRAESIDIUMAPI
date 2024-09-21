package br.com.quintinno.praesidiumapi.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableWebSecurity
@Configuration
public class SegurancaConfiguration {

    private static final String[] PUBLIC_ENDPOINT = {"/", "/api/autorizador/**"};

    // @Bean
    // public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    //     return httpSecurity.csrf(csrf -> csrf.disable())
    //         .authorizeHttpRequests(authorizeHttpRequest -> authorizeHttpRequest.requestMatchers(PUBLIC_ENDPOINT).permitAll().anyRequest().authenticated()) 
    //         .httpBasic(Customizer.withDefaults())
    //         .oauth2ResourceServer(configuration -> configuration.jwt(Customizer.withDefaults()))
    //         .build();
    // }

}
