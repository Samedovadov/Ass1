package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    @Primary
    Person Mike(){
        Person person = new Person();
        person.setName("Mike");
        person.setAge(22);
        person.setGender("Male");
        return person;
    }

    @Bean
    Person Bob(){
        Person person = new Person();
        person.setName("Bob");
        person.setAge(22);
        person.setGender("Male");
        return person;
    }

    @Bean
    Person Jack(){
        Person person = new Person();
        person.setName("Sweety Fox");
        person.setAge(22);
        person.setGender("Female");
        return person;
    }
}

