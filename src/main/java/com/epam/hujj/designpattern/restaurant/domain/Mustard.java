package com.epam.hujj.designpattern.restaurant.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mustard implements Product {

	private Logger logger = LoggerFactory.getLogger(Mustard.class);
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
    	logger.debug(getProductName()+ " Happiness modifier: " + HAPPINESS_MODIFIER);
        return HAPPINESS_MODIFIER;
    }

    @Override
    public String getProductName() {
        return "Mustard";
    }

}
