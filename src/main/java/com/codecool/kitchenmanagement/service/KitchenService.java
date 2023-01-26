package com.codecool.kitchenmanagement.service;

import com.codecool.kitchenmanagement.exceptions.OutOfIngredientsException;
import com.codecool.kitchenmanagement.model.employees.KitchenHelper;
import com.codecool.kitchenmanagement.model.kitchenItems.IngredientTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class KitchenService {

    private final List<KitchenHelper> kitchenHelpers = new ArrayList<>();





    public IngredientTypes requestIngredient(IngredientTypes ingredientTypes) throws OutOfIngredientsException {
        for (KitchenHelper kitchenHelper : kitchenHelpers) {
            Optional<IngredientTypes> optionalIngredientTypes = kitchenHelper.giveIngredient(ingredientTypes);
            if (optionalIngredientTypes.isPresent()) {
                return optionalIngredientTypes.get();
            }
        }
        throw new OutOfIngredientsException();
    }
}
