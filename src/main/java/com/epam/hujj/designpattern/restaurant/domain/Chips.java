package com.epam.hujj.designpattern.restaurant.domain;

public class Chips implements Product {

    private double modifier = 1.05;

    public double calculateHappiness(double happiness) {
        return happiness * modifier;
    }

    public String getName() {
        return "Chips";
    }

}
