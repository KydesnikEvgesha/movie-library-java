package ru.evgeniykravchenko.movielibrary.rest.impl.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"ru.evgeniykravchenko.movielibrary.business.impl"})
public class ApplicationConfig {
}
