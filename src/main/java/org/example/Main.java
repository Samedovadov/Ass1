package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class, Secbean.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.getName());


        pc pc = context.getBean(pc.class);
        System.out.println(pc.getCPU() + " " + pc.getGPU() + " " + pc.getRAM() + " " + pc.getHDD()) ;

        System.out.println("Этот компьютер принадлежит:" + pc.getPerson().getName());
    }
}