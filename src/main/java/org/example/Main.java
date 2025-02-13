package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Mike");
        person.setAge(22);
        person.setGender("Male");
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        }
    }
