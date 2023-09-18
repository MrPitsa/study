package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component

public class Cat {
    @Value("${cat.name}")
    private String name;

    Person person;

    @Autowired
    @Lazy
    public Cat(Person person) {
        this.person = person;
    }

    public Cat() {
        System.out.println("Cat created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", person=" + person.getName() +
                '}';
    }
}
