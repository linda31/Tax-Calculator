package com.taxcalculator.model;

public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int salary) {
        super(name, salary);
        this.setNumberOfHoursPerWeek(40);
        this.setType("FullTime");
    }

}
