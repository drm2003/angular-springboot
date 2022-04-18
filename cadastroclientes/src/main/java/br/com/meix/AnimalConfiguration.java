package br.com.meix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {
	@Bean
	public Animal cachorro() {
		return new Animal() {
			@Override
			public void fazerBarulho() {
				System.out.println("Au Au");

			}
		};
	}

	@Bean
	public Animal gato() {
		return new Animal() {

			@Override
			public void fazerBarulho() {
				System.out.println("Miau");

			}
		};
	}
}
