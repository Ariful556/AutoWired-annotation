package com.example.dependencyInjection.model;

import org.springframework.stereotype.Component;

@Component
public class Student implements Person{
    private String name;
    private String Id;
    private String profession;
    public Student() {
        this.name = "Md.Ariful Islam.";
        this.profession="Trainee Software Engineer.";
        this.Id="30076.";

    }
    @Override
    public void showInfo() {
        System.out.println("Name: "+name+ " Id Number:"+Id+ " Profession: "+profession);
    }
}
