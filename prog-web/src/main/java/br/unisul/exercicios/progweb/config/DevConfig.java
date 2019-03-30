package br.unisul.exercicios.progweb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DevConfig {

    @Autowired
    DbService dbService;

    @Value("${spring.jpa.hibernate.ddl-auto}")
    private String strategy;

    @Bean
    public boolean inicializaBancoDeDados() {
        if (!"create".equals(strategy)) {
            return false;
        }
        dbService.inicializaBancoDeDados();
        return true;
    }
}
