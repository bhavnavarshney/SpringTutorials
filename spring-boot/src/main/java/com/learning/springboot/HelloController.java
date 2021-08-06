package com.learning.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.Arrays;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello, Spring Boot!";
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Let's inspect the bean provided by Spring boot");
            String[] beans = ctx.getBeanDefinitionNames();
            Arrays.sort(beans);
            for(String name : beans){
                System.out.println(name);
            }

        };
    }
}
