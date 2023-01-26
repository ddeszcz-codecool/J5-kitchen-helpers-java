package com.codecool.kitchenmanagement.model.employees;

import com.codecool.kitchenmanagement.model.kitchenItems.IngredientTypes;

import java.util.Date;
import java.util.EnumMap;
import java.util.Map;
import java.util.Optional;

public class KitchenHelper extends Employee{
    private final Map<IngredientTypes, Integer> ingredients;

    public KitchenHelper(String name, double salary, Date birthDate) {
        super(name, birthDate, salary);
        ingredients = new EnumMap<>(IngredientTypes.class);
    }

    public Optional<IngredientTypes> giveIngredient(IngredientTypes ingredientTypes) {
        if (ingredients.get(ingredientTypes) > 0) {
            Integer ingredientAmount = ingredients.get(ingredientTypes);
            ingredients.merge(ingredientTypes, ingredientAmount - 1, (oldValue, value) -> value);
            return Optional.of(ingredientTypes);
        }
        return Optional.empty();
    }
}
