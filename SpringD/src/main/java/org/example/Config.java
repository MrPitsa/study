package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class Config {

    /*@Bean("felix")
    Cat felix() {
        Cat cat = new Cat();
        cat.setName("Felix");
        return cat;
    }

    @Bean
    Cat marta() {
        Cat cat = new Cat();
        cat.setName("Marta");
        return cat;
    }

    @Bean
    String hello() {
        return "Hello world";
    }

    @Bean
    Integer five() {
        return 5;
    }*/
}
