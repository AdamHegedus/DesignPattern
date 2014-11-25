package com.epam.hujj.designpattern.restaurant.domain;

public interface Product {

    /**
     * Gets the happiness modifier by calculating the given happiness parameter.
     * @param happiness, the initial happiness of the client
     * @return the happiness modifier
     */
    public double getHappinessModifier(final double happiness);

    /**
     * Gets the name of the product.
     * @return product name
     */
    public String getProductName();
}
