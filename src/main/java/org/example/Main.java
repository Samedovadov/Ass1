package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
       var context = new AnnotationConfigApplicationContext(ProjectConfig.class, Secbean.class);
       Person p = context.getBean(Person.class);
       System.out.println(p.getName());
       System.out.println(p.getAge());
       System.out.println(p.getGender());
       pc pc = context.getBean("pc1",pc.class);
        System.out.println(pc.getCPU());
        System.out.println(pc.getGPU());
        }
    }
