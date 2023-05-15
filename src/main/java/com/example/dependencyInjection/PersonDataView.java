package com.example.dependencyInjection;

import com.example.dependencyInjection.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDataView {
    @Autowired
    private Person person;
    public void view(){
        person.showInfo();
    }
}
