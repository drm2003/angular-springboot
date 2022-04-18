package br.com.meix;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meix.annotation.Profile.Cachorro;

@SpringBootApplication
@RestController
public class VendasApplication {

	@Value("${application.name}")
	public String applicationName;

	@Cachorro
	private Animal animal;

	@Bean(name = "ExecutarAnimal")
	public CommandLineRunner executar() {
		return args -> {
			this.animal.fazerBarulho();
		};
	}

	@GetMapping("/hello")
	public String helloWorld() {
		return this.applicationName;
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}
}