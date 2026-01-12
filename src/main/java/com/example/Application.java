package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.info("Starting AI-Driven Continuous Delivery Pipeline Optimization application.");
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public void init() {
        logger.info("Initializing AI-Driven Optimization components");
        // Initialize AI components or services here
    }
}