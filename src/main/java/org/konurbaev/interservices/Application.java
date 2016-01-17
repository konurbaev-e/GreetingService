package org.konurbaev.interservices;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan
@EnableAutoConfiguration
class Application {

    @Bean
    CommandLineRunner init(FirstService firstService, SecondService secondService) {
        return (evt) -> {
            firstService.printHello();
            secondService.printHello();
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}