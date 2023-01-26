package com.codecool.kitchenmanagement.service;

import com.codecool.kitchenmanagement.exceptions.NoKnifeException;
import com.codecool.kitchenmanagement.model.employees.Chef;
import com.codecool.kitchenmanagement.model.employees.Cook;
import com.codecool.kitchenmanagement.model.employees.Cooking;
import com.codecool.kitchenmanagement.model.kitchenItems.Knife;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
public class Kitchen {

    private Chef chef;

    private final List<Cook> cooks = new ArrayList<>();





    public void produceMeals() {
        if (Objects.isNull(chef)) {
            throw new RuntimeException("Nie można gotować. Zwijamy kuchnię!");

        }
        List<Cooking> cookingPeople = new ArrayList<>(cooks);
        cookingPeople.add(chef);

        cookingPeople.forEach(person -> {
            try {
                person.cook();
            } catch (NoKnifeException e) {
                person.addKnife(new Knife());
                System.out.println("Nóż otrzymany.");
            }
        });
    }

}
