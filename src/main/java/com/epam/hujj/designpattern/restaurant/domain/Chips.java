package com.epam.hujj.designpattern.restaurant.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Chips implements Product {

    private Logger logger = LoggerFactory.getLogger(Chips.class);
    private final double HAPPINESS_MODIFIER = 0.05;

    @Override
    public double getHappinessModifier(double happiness) {
        logger.debug(getProductName() + " Happiness modifier: "
                + HAPPINESS_MODIFIER * happiness);
        return HAPPINESS_MODIFIER * happiness;
    }

    @Override
    public String getProductName() {
        return "Chips";
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return getProductName();
    }

}
