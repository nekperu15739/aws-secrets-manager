package org.nekperu15739.awspring.secretsmanager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@Slf4j
@SpringBootApplication
public class SecretsManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecretsManagerApplication.class, args);
    }

    @Bean
    CommandLineRunner loadTestData(final PersonRepository repository) {
        return args -> {
            final var save = repository.save(Person
					.builder()
					.id(UUID.randomUUID())
					.build());

            log.info("Person saved:{}", save);
        };
    }
}
