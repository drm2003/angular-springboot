package br.com.meix;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.meix.annotation.Profile.Development;

@Configuration
@Development
public class MinhaConfiguration {
	@Bean
	public CommandLineRunner executar() {
		return args -> {
			System.out.println("RODANDO A CONFIGURAÇÃO DE DESENVOLVIMENTO");
		};
	}

	// Transferido para o arquivo application.properties
	/*
	 * @Bean (name = "applicationName") public String applicationName() { return
	 * "Sistema de Vendas"; }
	 */
}