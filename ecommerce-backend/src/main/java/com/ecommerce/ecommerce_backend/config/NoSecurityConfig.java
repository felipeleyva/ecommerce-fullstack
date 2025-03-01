package com.ecommerce.ecommerce_backend.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class NoSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf.disable()) // Desactiva CSRF
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Permite acceso a todos los endpoints sin autenticación
                )
                .formLogin(form -> form.disable()) // Desactiva login
                .httpBasic(httpBasic -> httpBasic.disable()); // Desactiva autenticación básica

        return http.build();
    }
}
