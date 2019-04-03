package br.unisul.exercicios.progweb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevConfig {

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String strategy;

    @Bean
    public boolean inicializaBancoDeDados(DbService dbService) {
        if (!"create".equals(strategy)) {
            return false;
        }
        dbService.inicializaBancoDeDados();
        return true;
    }
}
