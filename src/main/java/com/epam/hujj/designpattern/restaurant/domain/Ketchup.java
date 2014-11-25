package com.epam.hujj.designpattern.restaurant.domain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ketchup implements Product {

	private Logger logger = LoggerFactory.getLogger(Ketchup.class);
	private final double HAPPINESS_MODIFIER = 2.0;
	private Product product;

	/**
	 * Sets the product.
	 * 
	 * @param product
	 *            , the original product
	 */
	public Ketchup(Product product) {
		this.product = product;
	}

	@Override
	public double getHappinessModifier(double happiness) {
		logger.debug(getProductName()+ " Happiness modifier: " + product.getHappinessModifier(happiness) * HAPPINESS_MODIFIER);
		return product.getHappinessModifier(happiness) * HAPPINESS_MODIFIER;
	}

	@Override
	public String getProductName() {
		return "Ketchup";
	}
}
