package com.epam.hujj.designpattern.restaurant.domain;

public class Chips implements Product {

    private final double HAPPINESS_MODIFIER = 0.05;

    @Override
    public double getHappinessModifier(double happiness) {
        return HAPPINESS_MODIFIER * happiness;
    }

    @Override
    public String getProductName() {
        return "Chips";
    }
}
