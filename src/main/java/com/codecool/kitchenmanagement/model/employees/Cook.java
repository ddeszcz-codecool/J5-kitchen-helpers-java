package com.codecool.kitchenmanagement.model.employees;

import java.util.Date;

public class Cook extends Cooking {

    public Cook(String name, double salary, Date birthDate) {
        super(name, birthDate, salary);
    }

    @Override
    public void shout(String message) {
        super.shout("I am cooking");
    }
}