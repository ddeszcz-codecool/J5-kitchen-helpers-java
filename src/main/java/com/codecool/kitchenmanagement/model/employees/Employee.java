package com.codecool.kitchenmanagement.model.employees;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.Date;

@AllArgsConstructor
@Getter
public abstract class Employee {

    private String name;
    private Date birthdate;
    private double salary;


    public double getTax() {
        return 0.99 * salary;
    }
    @Override
    public String toString() {
        return name + "Salary: " + salary + " Birth Date: " + birthdate;
    }

}
