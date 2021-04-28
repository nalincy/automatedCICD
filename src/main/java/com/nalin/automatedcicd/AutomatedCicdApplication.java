package com.nalin.automatedcicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutomatedCicdApplication {

    public static void main(String[] args) {
        System.out.println("Hello");
        SpringApplication.run(AutomatedCicdApplication.class, args);
    }

}
