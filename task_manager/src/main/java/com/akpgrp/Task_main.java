package com.akpgrp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.akpgrp.repository")
public class Task_main {
    public static void main(String[] args) {
        SpringApplication.run(Task_main.class, args);
    }
}
