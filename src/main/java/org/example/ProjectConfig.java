package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Bean
    @Primary
    public Person Mike() {
        Person person = new Person();
        person.setName("Mike");
        person.setAge(22);
        person.setGender("Male");
        return person;
    }

    @Bean
    public Person Bob() {
        Person person = new Person();
        person.setName("Bob");
        person.setAge(22);
        person.setGender("Male");
        return person;
    }

    @Bean
    public Person Jack() {
        Person person = new Person();
        person.setName("Sweety Fox");
        person.setAge(22);
        person.setGender("Female");
        return person;
    }
}
