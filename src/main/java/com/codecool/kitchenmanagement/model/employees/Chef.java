package com.codecool.kitchenmanagement.model.employees;

import com.codecool.kitchenmanagement.exceptions.NoKnifeException;
import com.codecool.kitchenmanagement.exceptions.OutOfIngredientsException;
import com.codecool.kitchenmanagement.model.kitchenItems.IngredientTypes;
import com.codecool.kitchenmanagement.service.KitchenService;
import lombok.Setter;

import java.util.Date;
import java.util.Random;

public class Chef extends Cooking {

    @Setter
    KitchenService kitchenService;

    public Chef(String name, double salary, Date birthDate) {
        super(name, birthDate, salary);
    }

    public void requestIngredient(IngredientTypes ingredientTypes) {
        try {
            kitchenService.requestIngredient(ingredientTypes);
            shout("Thank you!");
        } catch (OutOfIngredientsException e) {
            shout("We're all out");
        }
    }
    public void cook() throws NoKnifeException {
        boolean isCooking = new Random().nextBoolean();
        if (getKnives().isEmpty()) {
            throw new NoKnifeException();
        }
        if (isCooking) {
            shout("I'm Chef and I'm cooking!");
        } else {
            requestIngredient(IngredientTypes.randomIngredient());
        }
    }




}
