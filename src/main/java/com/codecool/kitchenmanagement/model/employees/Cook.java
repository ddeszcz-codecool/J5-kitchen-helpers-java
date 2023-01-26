package com.codecool.kitchenmanagement.model.employees;

import com.codecool.kitchenmanagement.exceptions.NoKnifeException;

import java.util.Date;

public class Cook extends Cooking {

    public Cook(String name, double salary, Date birthDate) {
        super(name, birthDate, salary);
    }

    @Override
    public void shout(String message) {
        super.shout("I am cooking");
    }

    public void cook() throws NoKnifeException {
        if (getKnives().isEmpty()) {
            throw new NoKnifeException();
        } shout("I'm cooking!");
    }

}