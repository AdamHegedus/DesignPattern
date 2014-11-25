package com.epam.hujj.designpattern.restaurant.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HotDog implements Product {

	private Logger logger = LoggerFactory.getLogger(HotDog.class);
    private final double HAPPINESS_MODIFIER = 2.0;

    @Override
    public double getHappinessModifier(double happiness) {
    	logger.debug(getProductName()+ " Happiness modifier: " + HAPPINESS_MODIFIER);
        return HAPPINESS_MODIFIER;
    }

    @Override
    public String getProductName() {
        return "Hot Dog";
    }

}
