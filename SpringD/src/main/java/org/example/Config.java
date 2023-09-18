package org.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example")
@PropertySource("application.properties")
public class Config {

    @Bean("felix")
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

}
