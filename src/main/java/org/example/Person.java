package org.example;

import org.springframework.stereotype.Component;

@Component
public class Person {
private String name;
private int age;
private String gender;
private Boolean isstudnet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Boolean getIsstudnet() {
        return isstudnet;
    }

    public void setIsstudnet(Boolean isstudnet) {
        this.isstudnet = isstudnet;
    }
}
