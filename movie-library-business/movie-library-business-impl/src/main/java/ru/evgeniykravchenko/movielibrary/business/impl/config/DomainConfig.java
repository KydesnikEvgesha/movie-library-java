package ru.evgeniykravchenko.movielibrary.business.impl.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * The type Domain config.
 */
@Configuration
@EnableJpaRepositories(
        basePackages = {"ru.evgeniykravchenko.movielibrary.domain.repository"}
)
@EntityScan(basePackages = {"ru.evgeniykravchenko.movielibrary.domain.model"})
public class DomainConfig {
}
