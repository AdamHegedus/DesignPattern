package com.epam.hujj.designpattern.restaurant.domain;

public class Ketchup implements Product {

    private final double HAPPINESS_MODIFIER = 2.0;
    private Product product;

    /**
     * Sets the product.
     * @param product, the original product
     */
    public Ketchup(Product product) {
        this.product = product;
    }

    @Override
    public double getHappinessModifier(double happiness) {
        return product.getHappinessModifier(happiness) * HAPPINESS_MODIFIER;
    }

    @Override
    public String getProductName() {
        return "Ketchup";
    }
}
