package com.codecool.kitchenmanagement.model.kitchenItems;

import java.util.Random;

public enum IngredientTypes {
    MEAT, POTATO, CARROT;


    public static IngredientTypes randomIngredient() {
        IngredientTypes[] ingredients =  IngredientTypes.values();
        return ingredients[new Random().nextInt(ingredients.length)];
    }
}
