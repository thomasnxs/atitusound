package br.edu.atitus.pooavancado.atitusound.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class ConfigSwagger {

	@Bean
	public OpenAPI getOpenApi() {
		return new OpenAPI()
				.info(new Info().title("Api Atitus Sound").description("Docs do backend").version("Version 1.0.0")
						.contact(new Contact().name("Leonardo and Eduardo").email("dupladedois@atitus.com")));
	}

}
