package com.epam.hujj.designpattern.restaurant.domain;

public class HotDog implements Product {

    private final double HAPPINESS_MODIFIER = 2.0;

    @Override
    public double getHappinessModifier(double happiness) {
        return HAPPINESS_MODIFIER;
    }

    @Override
    public String getProductName() {
        return "Hot Dog";
    }

}
