package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(Config.class);

        var alex1 = context.getBean(Person.class);
        var alex2 = context.getBean(Person.class);

        System.out.println(alex1);
        System.out.println(alex1.getCat());

        System.out.println(alex1 == alex2);
    }
}