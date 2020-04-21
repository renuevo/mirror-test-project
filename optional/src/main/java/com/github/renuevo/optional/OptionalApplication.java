package com.github.renuevo.optional;


import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@AllArgsConstructor
@SpringBootApplication
public class OptionalApplication {

    public static void main(String[] args) {
        SpringApplication.run(OptionalApplication.class, args);
    }

}
