package com.edureka.SpringWebClientApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@SpringBootApplication
@EnableWebFlux
public class App {
    public static void main(String[] args) { // throws Exception {
        SpringApplication.run(App.class);
    }
}