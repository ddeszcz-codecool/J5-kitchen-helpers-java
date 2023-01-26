package com.codecool.kitchenmanagement;

import com.codecool.kitchenmanagement.model.employees.Chef;
import com.codecool.kitchenmanagement.model.employees.Cook;
import com.codecool.kitchenmanagement.model.employees.KitchenHelper;
import com.codecool.kitchenmanagement.service.Kitchen;

import java.time.Instant;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ramsay: WHAT ARE YOU?");
        System.out.println("Kitchen helper: An idiot sandwich.");
		System.out.println("Ramsay: IDIOT SANDWICH WHAT?");
		System.out.println("Kitchen helper: An idiot sandwich, chef Ramsay.");


        Kitchen kitchen = new Kitchen();

        kitchen.setChef(new Chef("Monica", 3600, Date.from(Instant.now())));
        kitchen.addCook(new Cook("David1", 1500, Date.from(Instant.now())));
        kitchen.addCook(new Cook("David2", 1500, Date.from(Instant.now())));
        kitchen.addCook(new Cook("David3", 1500, Date.from(Instant.now())));
        kitchen.addCook(new Cook("David4", 1500, Date.from(Instant.now())));
        kitchen.addCook(new Cook("David5", 1500, Date.from(Instant.now())));
        kitchen.addKitchenHelpers(new KitchenHelper("David6", 1500, Date.from(Instant.now())));
        kitchen.addKitchenHelpers(new KitchenHelper("David7", 1500, Date.from(Instant.now())));
        kitchen.addKitchenHelpers(new KitchenHelper("David8", 1500, Date.from(Instant.now())));
        kitchen.addKitchenHelpers(new KitchenHelper("David9", 1500, Date.from(Instant.now())));

        for (int i = 0; i < 20; i++) {
            kitchen.produceMeals();
        }




    }
}
