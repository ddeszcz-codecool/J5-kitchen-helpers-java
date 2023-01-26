package com.codecool.kitchenmanagement.model.employees;

import com.codecool.kitchenmanagement.exceptions.NoKnifeException;
import com.codecool.kitchenmanagement.model.kitchenItems.Knife;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Cooking extends Employee {

    @Getter
    private List<Knife> knives = new ArrayList<>();


    public Cooking(String name, Date birthdate, double salary) {
        super(name, birthdate, salary);
    }

    public void shout(String message) {
        System.out.println(message);
    }

    public void addKnife(Knife knife) {
        knives.add(knife);
    }

    public abstract void cook() throws NoKnifeException;


}

