package com.codecool.kitchenmanagement.model.employees;

import java.util.Date;

public abstract class Cooking extends Employee {


    public Cooking(String name, Date birthdate, double salary) {
        super(name, birthdate, salary);
    }

    public void shout(String message) {
        System.out.println(message);
    }
}

