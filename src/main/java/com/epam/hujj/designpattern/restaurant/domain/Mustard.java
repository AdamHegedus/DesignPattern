package com.epam.hujj.designpattern.restaurant.domain;

public class Mustard implements Product {

    private final double HAPPINESS_MODIFIER = 1.0;

    /**
     * The given parameter is not used because the Mustard defeats the effect of
     * a product and returns a constant.
     * @param not used
     */
    public Mustard(Product product) {
    }

    @Override
    public double getHappinessModifier(double happiness) {
        return HAPPINESS_MODIFIER;
    }

    @Override
    public String getProductName() {
        return "Mustard";
    }

}
